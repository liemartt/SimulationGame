package simulation;

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class EntityMap {
    private Map<Point, Entity> map;
    private int grassCounter = 0, rockCounter = 0, treeCounter = 0, herbivoreCounter = 0;
    private final int width = 20;
    private final int height = 20;

    public Point getRandomPoint() {
        Random random = new Random();
        while (true) {
            Point point = new Point(random.nextInt(width), random.nextInt(height));
            if (!map.containsKey(point)) return point;
        }
    }

    public EntityMap() {
        map = new TreeMap<>();
    }

    public Map<Point, Entity> getMap() {
        return map;
    }

    public void setGrassCounter(int grassCounter) {
        this.grassCounter = grassCounter;
    }

    public void setRockCounter(int rockCounter) {
        this.rockCounter = rockCounter;
    }

    public void setTreeCounter(int treeCounter) {
        this.treeCounter = treeCounter;
    }

    public void setHerbivoreCounter(int herbivoreCounter) {
        this.herbivoreCounter = herbivoreCounter;
    }

    public int getGrassCounter() {
        return grassCounter;
    }

    public int getRockCounter() {
        return rockCounter;
    }

    public int getTreeCounter() {
        return treeCounter;
    }

    public int getHerbivoreCounter() {
        return herbivoreCounter;
    }


    public int getSize() {
        return width * height;
    }


}
