package simulation.actions;

import simulation.EntityMap;
import simulation.Grass;

public class GrassSpawnAction extends SpawnEntityAction<Grass> {
    private final double spawnRate = 0.2;
    @Override
    Grass createEntity(EntityMap map) {
        return new Grass(map);
    }
}
