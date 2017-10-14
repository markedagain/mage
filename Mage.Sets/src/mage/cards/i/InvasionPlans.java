/*
 * Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are
 * permitted provided that the following conditions are met:
 *
 *    1. Redistributions of source code must retain the above copyright notice, this list of
 *       conditions and the following disclaimer.
 *
 *    2. Redistributions in binary form must reproduce the above copyright notice, this list
 *       of conditions and the following disclaimer in the documentation and/or other materials
 *       provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 * FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 * ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 * ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 * The views and conclusions contained in the software and documentation are those of the
 * authors and should not be interpreted as representing official policies, either expressed
 * or implied, of BetaSteward_at_googlemail.com.
 */
package mage.cards.i;

import java.util.UUID;
import mage.abilities.Ability;
import mage.abilities.common.SimpleStaticAbility;
import mage.abilities.effects.ContinuousRuleModifyingEffectImpl;
import mage.abilities.effects.common.combat.BlocksIfAbleAllEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.*;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.game.events.GameEvent.EventType;
import mage.game.permanent.Permanent;
import mage.players.Player;
import mage.players.PlayerList;
import static mage.filter.StaticFilters.FILTER_PERMANENT_CREATURES;

/**
 *
 * @author L_J
 */
public class InvasionPlans extends CardImpl {

    public InvasionPlans(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ENCHANTMENT}, "{2}{R}");

        // All creatures block each turn if able. 
        this.addAbility(new SimpleStaticAbility(Zone.BATTLEFIELD, new BlocksIfAbleAllEffect(FILTER_PERMANENT_CREATURES)));
        // The attacking player chooses how each creature blocks each turn.
        this.addAbility(new SimpleStaticAbility(Zone.BATTLEFIELD, new InvasionPlansEffect()));
    }

    public InvasionPlans(final InvasionPlans card) {
        super(card);
    }

    @Override
    public InvasionPlans copy() {
        return new InvasionPlans(this);
    }
}

class InvasionPlansEffect extends ContinuousRuleModifyingEffectImpl {

    public InvasionPlansEffect() {
        super(Duration.WhileOnBattlefield, Outcome.Benefit, true, false);
    }

    public InvasionPlansEffect(final InvasionPlansEffect effect) {
        super(effect);
    }

    @Override
    public InvasionPlansEffect copy() {
        return new InvasionPlansEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        return true;
    }

    @Override
    public boolean checksEventType(GameEvent event, Game game) {
        return event.getType() == GameEvent.EventType.DECLARING_BLOCKERS;
    }

    @Override
    public boolean applies(GameEvent event, Ability source, Game game) {
        Player blockController = game.getPlayer(game.getCombat().getAttackingPlayerId());
        if (blockController != null) {
            game.getCombat().selectBlockers(blockController, game);
            return event.getPlayerId().equals(game.getCombat().getAttackingPlayerId());
        }
        return false;
    }
}
