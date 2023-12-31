package simulation.actions;

import simulation.entities.Entity;
import simulation.EntityMap;
import simulation.Point;

public abstract class SpawnEntityAction<T extends Entity> extends Action {
    double spawnRate;

    @Override
    public void doAction(EntityMap map) {
        double rateDelta = 1.0 / (map.getSize());
        double rate = 0;
        while (rate <= spawnRate) {
            Point point = map.getRandomPoint();
            if (point == null) {
                return;
            }
            map.add(point, createEntity(map));
            rate += rateDelta;
        }
    }

    abstract T createEntity(EntityMap map);
}
