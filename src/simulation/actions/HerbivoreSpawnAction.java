package simulation.actions;

import simulation.EntityMap;
import simulation.Herbivore;

public class HerbivoreSpawnAction extends SpawnEntityAction<Herbivore> {
    public HerbivoreSpawnAction() {
        this.spawnRate = 0.1;
    }

    @Override
    Herbivore createEntity(EntityMap map) {
        return new Herbivore();
    }
}
