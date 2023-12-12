package simulation.entities;

import simulation.EntityMap;
import simulation.PathFinding;
import simulation.Point;

import java.util.List;

public abstract class Creature extends Entity {
    protected final PathFinding pathFinder = new PathFinding();
    private final int speed = 3;
    protected int hp = 30;

    public abstract void makeMove(EntityMap map);

    public void makeMoveToTarget(EntityMap map, Class<? extends Entity> target) {
        List<Point> path = pathFinder.findPath(map, map.getPointOfEntity(this), target);
        if (path != null) {
            Point newPoint = path.get(Math.min(path.size() - 1, speed));
            map.remove(map.getPointOfEntity(this));
            map.add(newPoint, this);
        }
    }

    public int getHp() {
        return hp;
    }
}
