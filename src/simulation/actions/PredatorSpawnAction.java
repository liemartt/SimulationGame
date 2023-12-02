package simulation.actions;

import simulation.EntityMap;
import simulation.Predator;

public class PredatorSpawnAction extends SpawnEntityAction<Predator> {
    public PredatorSpawnAction() {
        this.spawnRate = 0.04;
    }

    @Override
    Predator createEntity(EntityMap map) {
        return new Predator();
    }
}
