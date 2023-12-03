package simulation;

import simulation.actions.MakeMovesAction;

import java.util.List;

public abstract class Creature extends Entity {
    protected PathFinding pathFinder = new PathFinding();
    protected int speed = 3;
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

    public int getSpeed() {
        return speed;
    }

    public int getHp() {
        return hp;
    }
}
