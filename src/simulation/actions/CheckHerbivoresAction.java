package simulation.actions;

import simulation.EntityMap;
import simulation.entities.Herbivore;

public class CheckHerbivoresAction extends Action{
    @Override
    public void doAction(EntityMap map) {
        if(map.countEntities(Herbivore.class)==0){
            System.out.println("All herbivores are died");
            System.exit(1);
        }

    }
}
