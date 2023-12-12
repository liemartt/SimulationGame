package simulation.actions;

import simulation.*;
import simulation.entities.Rock;

public class RockSpawnAction extends SpawnEntityAction<Rock> {
    public RockSpawnAction() {
        this.spawnRate = 0.1;
    }

    @Override
    Rock createEntity(EntityMap map) {
        return new Rock(map);
    }
}
