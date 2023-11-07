package simulation.actions;

import simulation.Predator;

public class PredatorSpawnAction extends SpawnEntityAction<Predator> {

    @Override
    Predator createEntity() {
        return new Predator();
    }
}
