package simulation.actions;

import simulation.Herbivore;

public class HerbivoreSpawnAction extends SpawnEntityAction<Herbivore> {
    @Override
    Herbivore createEntity() {
        return new Herbivore();
    }
}
