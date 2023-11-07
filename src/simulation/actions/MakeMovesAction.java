package simulation.actions;

import simulation.Creature;
import simulation.Entity;
import simulation.EntityMap;

import java.util.List;


public class MakeMovesAction extends Action{
    @Override
    public void doAction(EntityMap map) {
        List<Entity> entities = map.getMap().values().stream().toList();
        for (Entity entity:entities){
            if(entity instanceof Creature){
                ((Creature) entity).makeMove();
            }
        }
    }
}
