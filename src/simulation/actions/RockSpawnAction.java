package simulation.actions;

import simulation.EntityMap;
import simulation.Grass;
import simulation.Point;
import simulation.Rock;

public class RockSpawnAction extends Action {
    private final double spawnRate = 0.2;

    @Override
    public void doAction(EntityMap map) {
        if ((double) map.getRockCounter() / map.getSize() <= spawnRate) return;
        Point place = map.getRandomPoint();
        map.getMap().put(place, new Rock());
        map.setRockCounter(map.getRockCounter() + 1);
    }
}
