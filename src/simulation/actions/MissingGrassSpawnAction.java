package simulation.actions;

import simulation.EntityMap;
import simulation.Grass;
import simulation.Point;

public class MissingGrassSpawnAction extends SpawnEntityAction<Grass>{
    @Override
    public void doAction(EntityMap map){
        long grassCounter = map.countEntities(Grass.class);
        while (((double) grassCounter / map.getSize())<0.1){
            Point point = map.getRandomPoint();
            if (point == null) {
                System.out.println("No empty points");//TODO Exception
                return;
            }
            map.getMap().put(point, createEntity(map));
            grassCounter = map.countEntities(Grass.class);
        }
    }
    @Override
    Grass createEntity(EntityMap map) {
        return new Grass(map);
    }
}
