package simulation.actions;

import simulation.EntityMap;
import simulation.Grass;
import simulation.Point;

public class GrassSpawnAction extends Action {
    private final double spawnRate = 0.2;

    @Override
    public void doAction(EntityMap map) {
        if ((double) map.getGrassCounter() / map.getSize() <= spawnRate) return;
        Point place = map.getRandomPoint();
        map.getMap().put(place, new Grass());
        map.setGrassCounter(map.getGrassCounter() + 1);
    }
}
