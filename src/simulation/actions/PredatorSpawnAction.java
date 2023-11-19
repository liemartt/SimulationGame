package simulation.actions;

import simulation.EntityMap;
import simulation.Predator;

public class PredatorSpawnAction extends SpawnEntityAction<Predator> {

    @Override
    Predator createEntity(EntityMap map) {
        return new Predator();
    }
}
