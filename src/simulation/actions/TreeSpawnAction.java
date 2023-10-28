package simulation.actions;

import simulation.EntityMap;
import simulation.Point;
import simulation.Rock;
import simulation.Tree;

public class TreeSpawnAction extends Action {
    private final double spawnRate = 0.2;

    @Override
    public void doAction(EntityMap map) {
        if ((double) map.getTreeCounter() / map.getSize() <= spawnRate) return;
        Point place = map.getRandomPoint();
        map.getMap().put(place, new Tree());
        map.setTreeCounter(map.getTreeCounter() + 1);
    }
}
