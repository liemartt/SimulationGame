package simulation.actions;

import simulation.*;

public class RockSpawnAction extends SpawnEntityAction<Rock> {
    private final double spawnRate = 0.2;
    @Override
    Rock createEntity(EntityMap map) {
        return new Rock(map);
    }
}
