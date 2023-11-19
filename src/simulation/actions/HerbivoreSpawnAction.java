package simulation.actions;

import simulation.EntityMap;
import simulation.Herbivore;

public class HerbivoreSpawnAction extends SpawnEntityAction<Herbivore> {

    @Override
    Herbivore createEntity(EntityMap map) {
        return new Herbivore();
    }
}
