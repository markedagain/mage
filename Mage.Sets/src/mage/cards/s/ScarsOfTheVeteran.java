package mage.cards.s;

import java.util.UUID;
import mage.ObjectColor;
import mage.abilities.Ability;
import mage.abilities.DelayedTriggeredAbility;
import mage.abilities.costs.AlternativeCostSourceAbility;
import mage.abilities.costs.common.ExileFromHandCost;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.common.CreateDelayedTriggeredAbilityEffect;
import mage.abilities.effects.common.PreventDamageToTargetEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;
import mage.constants.Outcome;
import mage.counters.CounterType;
import mage.filter.common.FilterOwnedCard;
import mage.filter.predicate.Predicates;
import mage.filter.predicate.mageobject.ColorPredicate;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.game.permanent.Permanent;
import mage.players.Player;
import mage.target.common.TargetAnyTarget;
import mage.target.common.TargetCardInHand;
import mage.watchers.common.DamagePreventedWatcher;

/**
 *
 * @author MarkedAgain
 */
public final class ScarsOfTheVeteran extends CardImpl {

    public ScarsOfTheVeteran(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.INSTANT}, "{4}{W}");
        

        // You may exile a white card from your hand rather than pay Scars of the Veteran's mana cost.
        FilterOwnedCard filter = new FilterOwnedCard("a white card from your hand");
        filter.add(new ColorPredicate(ObjectColor.WHITE));
        filter.add(Predicates.not(new mage.filter.predicate.mageobject.CardIdPredicate(this.getId()))); // the exile cost can never be paid with the card itself
        AlternativeCostSourceAbility ability = new AlternativeCostSourceAbility(new ExileFromHandCost(new TargetCardInHand(filter)));
        this.abilities.add(ability);
        
        // Prevent the next 7 damage that would be dealt to any target this turn. At the beginning of the next end step, put a +0/+1 counter on that creature for each 1 damage prevented this way.
        //ability.addEffect(new PreventDamageToTargetEffect(Duration.EndOfTurn, 7));
        this.getSpellAbility().addEffect(new PreventDamageToTargetEffect(Duration.EndOfTurn, 7));
        this.getSpellAbility().addTarget(new TargetAnyTarget());
        this.getSpellAbility().addEffect(new CreateDelayedTriggeredAbilityEffect(new ScarsOfTheVeteranDelayedTriggeredAbility()));
        this.getSpellAbility().addWatcher(new DamagePreventedWatcher());
        
    }

    private ScarsOfTheVeteran(final ScarsOfTheVeteran card) {
        super(card);
    }

    @Override
    public ScarsOfTheVeteran copy() {
        return new ScarsOfTheVeteran(this);
    }
    
}

class ScarsOfTheVeteranDelayedTriggeredAbility extends DelayedTriggeredAbility {


    public ScarsOfTheVeteranDelayedTriggeredAbility() {
        super( new ScarsOfTheVeteranCardEffect(),Duration.EndOfTurn); 
    }

    public ScarsOfTheVeteranDelayedTriggeredAbility(final ScarsOfTheVeteranDelayedTriggeredAbility ability) {
        super(ability);
    }

    @Override
    public ScarsOfTheVeteranDelayedTriggeredAbility copy() {
        return new ScarsOfTheVeteranDelayedTriggeredAbility(this);
    }

    @Override
    public boolean checkEventType(GameEvent event, Game game) {
        return event.getType() == GameEvent.EventType.END_TURN_STEP_PRE;
    }

    @Override
    public boolean checkTrigger(GameEvent event, Game game) {
        DamagePreventedWatcher watcher = game.getState().getWatcher(DamagePreventedWatcher.class);
        Permanent permanent = game.getPermanent(this.getFirstTarget());

        if (watcher.prevented(permanent.getId(), permanent.getZoneChangeCounter(game), game))
            return true;
        return false;
    }

    @Override
    public String getRule() {
        return "At the beginning of the next end step, put a +0/+1 counter on that creature for each 1 damage prevented this way";
    }

}
    
class ScarsOfTheVeteranCardEffect extends OneShotEffect {

    public ScarsOfTheVeteranCardEffect() {
        super(Outcome.BoostCreature);
    }

    public ScarsOfTheVeteranCardEffect(final ScarsOfTheVeteranCardEffect effect) {
        super(effect);
    }

    @Override
    public ScarsOfTheVeteranCardEffect copy() {
        return new ScarsOfTheVeteranCardEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        
        DamagePreventedWatcher watcher = game.getState().getWatcher(DamagePreventedWatcher.class);
        Player controller = game.getPlayer(source.getControllerId());
        Permanent permanent = game.getPermanent(getTargetPointer().getFirst(game, source));
        
        if (controller != null && permanent != null) {     
            int dmgPrevented = watcher.damagePreventedTo(permanent.getId(),permanent.getZoneChangeCounter(game),game);
            permanent.addCounters(CounterType.P0P1.createInstance(dmgPrevented), source, game);
            return true;
        }
        return false;
    }
}


