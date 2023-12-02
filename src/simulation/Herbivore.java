package simulation;

import java.util.List;

public class Herbivore extends Creature {

    private int speed = 1;
    private int hp = 100;


    private List<Point> path;

    @Override
    public void makeMove(EntityMap map) {
        if(!canEatGrass(map)){
            makeMoveToTarget(map, Grass.class);
        }
    }

    private boolean canEatGrass(EntityMap map) {
        if(map.getPointOfEntity(this)==null) return false;
        for(Point point:map.getNeighboursOfPoint(map.getPointOfEntity(this))){
            if(map.getMap().get(point) instanceof Grass){
                hp++;
                map.getMap().remove(map.getPointOfEntity(this));
                map.getMap().put(point, this);

                return true;
            }
        }
        return false;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "\uD83D\uDC07";//🐇
    }
}
