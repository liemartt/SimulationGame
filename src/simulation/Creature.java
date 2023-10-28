package simulation;

public abstract class Creature extends Entity {
    private int speed;
    private int hp;

    public abstract void makeMove();

    public int getSpeed() {
        return speed;
    }

    public int getHp() {
        return hp;
    }
}
