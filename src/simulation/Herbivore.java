package simulation;

import java.util.List;

public class Herbivore extends Creature {

    private List<Point> path;

    @Override
    public void makeMove(EntityMap map) {
        if (!canEatGrass(map)) {
            makeMoveToTarget(map, Grass.class);
        }
    }

    private boolean canEatGrass(EntityMap map) {

        for (Point point : map.getNeighboursOfPoint(map.getPointOfEntity(this))) {
            if (map.get(point) instanceof Grass) {
                hp += 10;
                map.remove(map.getPointOfEntity(this));
                map.add(point, this);
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
