package simulation.actions;

import simulation.EntityMap;
import simulation.Point;
import simulation.Rock;
import simulation.Tree;

public class TreeSpawnAction extends SpawnEntityAction<Tree> {
    public TreeSpawnAction() {
        this.spawnRate = 0.1;
    }

    @Override
    Tree createEntity(EntityMap map) {
        return new Tree(map);
    }
}
