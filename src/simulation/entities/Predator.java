package simulation.entities;

import simulation.EntityMap;
import simulation.Point;

public class Predator extends Creature {

    private final int attackPower = 10;


    public int getAttackPower() {
        return attackPower;
    }

    @Override
    public void makeMove(EntityMap map) {
        if (!canAttack(map)) {
            makeMoveToTarget(map, Herbivore.class);
        }
    }

    private boolean canAttack(EntityMap map) {
        for (Point point : map.getNeighboursOfPoint(map.getPointOfEntity(this))) {
            Entity neighbour = map.get(point);
            if (neighbour instanceof Herbivore) {
                ((Herbivore) neighbour).setHp(((Herbivore) neighbour).getHp() - attackPower);
                if (((Herbivore) neighbour).getHp() <= 0) {
                    map.remove(map.getPointOfEntity(this));
                    map.add(point, this);
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "\uD83D\uDC3A"; //🐺
    }
}
