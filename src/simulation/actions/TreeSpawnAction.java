package simulation.actions;

import simulation.EntityMap;
import simulation.Point;
import simulation.Rock;
import simulation.Tree;

public class TreeSpawnAction extends SpawnEntityAction<Tree> {
    private final double spawnRate = 0.2;

    @Override
    Tree createEntity(EntityMap map) {
        return new Tree(map);
    }
}
