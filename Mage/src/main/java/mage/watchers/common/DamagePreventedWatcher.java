package mage.watchers.common;

import mage.MageObjectReference;
import mage.constants.WatcherScope;
import mage.game.Game;
import mage.game.events.GameEvent;
import mage.watchers.Watcher;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author MarkedAgain
 */
public class DamagePreventedWatcher extends Watcher {

    // which objects damage was prevented and how much during the turn
    private final Map<MageObjectReference, Integer> damagingObjects;

    public Map<MageObjectReference, Integer> getDamagingObjects() {
        return damagingObjects;
    }

    public Map<MageObjectReference, Integer> getDamagedObjects() {
        return damagePreventedObjects;
    }

    // which object prevented how much damage during the turn
    private final Map<MageObjectReference, Integer> damagePreventedObjects;

    public DamagePreventedWatcher() {
        super(WatcherScope.GAME);
        this.damagingObjects = new HashMap<>();
        this.damagePreventedObjects = new HashMap<>();
    }

    private DamagePreventedWatcher(final DamagePreventedWatcher watcher) {
        super(watcher);
        this.damagingObjects = new HashMap<>(watcher.damagingObjects);
        this.damagePreventedObjects = new HashMap<>(watcher.damagePreventedObjects);
    }

    @Override
    public void watch(GameEvent event, Game game) {
        switch (event.getType()) {
            case PREVENTED_DAMAGE:
            case PREVENT_DAMAGE:
            {
                MageObjectReference damageSourceRef = new MageObjectReference(event.getSourceId(), game);
                damagingObjects.putIfAbsent(damageSourceRef, 0);
                damagingObjects.compute(damageSourceRef, (k, damage) -> damage + event.getAmount());

                MageObjectReference damageTargetRef = new MageObjectReference(event.getTargetId(), game);
                damagePreventedObjects.putIfAbsent(damageTargetRef, 0);
                damagePreventedObjects.compute(damageTargetRef, (k, damage) -> damage + event.getAmount());
            }
        }
    }

    @Override
    public void reset() {
        super.reset();
        damagingObjects.clear();
        damagePreventedObjects.clear();
    }

    public int damagePreventedBy(UUID objectId, int zoneChangeCounter, Game game) {
        MageObjectReference mor = new MageObjectReference(objectId, zoneChangeCounter, game);
        return damagingObjects.getOrDefault(mor, 0);
    }

    public int damagePreventedTo(UUID objectId, int zoneChangeCounter, Game game) {
        MageObjectReference mor = new MageObjectReference(objectId, zoneChangeCounter, game);
        return damagePreventedObjects.getOrDefault(mor, 0);
    }

    public boolean prevented(UUID objectId, int zoneChangeCounter, Game game) {
        MageObjectReference mor = new MageObjectReference(objectId, zoneChangeCounter, game);
        return damagePreventedObjects.containsKey(mor);
    }

}
