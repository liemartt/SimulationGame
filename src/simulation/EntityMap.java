package simulation;

import java.util.*;

public class EntityMap {
    //TODO private map without getMap
    private Map<Point, Entity> map;
    private int grassCounter = 0, rockCounter = 0, treeCounter = 0, herbivoreCounter = 0;
    private final int width = 10;
    private final int height = 10;

    public Point getRandomPoint() {
        if (map.size() == width * height) return null;
        Random random = new Random();
        while (true) {
            Point point = new Point(random.nextInt(width), random.nextInt(height));
            if (!map.containsKey(point)) return point;
        }
    }

    public EntityMap() {
        map = new HashMap<>();
    }

    public Map<Point, Entity> getMap() {
        return map;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    public Point getPointOfEntity(Entity entity){
        for (Map.Entry<Point, Entity> entry : map.entrySet()) {
            if (entry.getValue().equals(entity))
                return entry.getKey();
        }
        return null;
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

    public List<Point> getNeighboursOfPoint(Point point) {
        List<Point> neighbours = new ArrayList<>();
        int x = point.getX();
        int y = point.getY();

        if (x + 1 < width) neighbours.add(new Point(x + 1, y));
        if (x - 1 > width) neighbours.add(new Point(x - 1, y));
        if (y + 1 < height) neighbours.add(new Point(x, y + 1));
        if (y - 1 > height) neighbours.add(new Point(x, y - 1));

        return neighbours;
    }


}
