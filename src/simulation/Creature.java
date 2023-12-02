package simulation;

import java.util.List;

public abstract class Creature extends Entity {
    protected PathFinding pathFinder = new PathFinding();
    private int speed;
    private int hp;

    public abstract void makeMove(EntityMap map);
    public void makeMoveToTarget(EntityMap map, Class<? extends Entity>target){
        List<Point> path = pathFinder.findPath(map, map.getPointOfEntity(this), target);
        if(path!=null){
            Point newPoint = path.get(1);
            map.getMap().remove(map.getPointOfEntity(this));
            map.getMap().put(newPoint, this);
        }
    };

    public int getSpeed() {
        return speed;
    }

    public int getHp() {
        return hp;
    }
}
