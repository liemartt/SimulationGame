package simulation;

public class Predator extends Creature {
    private int attackPower;


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
            if (map.getMap().get(point) instanceof Herbivore) {
                map.getMap().remove(map.getPointOfEntity(this));
                map.getMap().put(point, this);
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
