package simulation;

import java.util.*;

public class EntityMap {
    //TODO private map without getMap
    private Map<Point, Entity> map;
    private final int width = 20;
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

    public long countEntities(Class<? extends Entity> entity){
        return map.values().stream().filter(x->x.getClass()==entity).count();
    }

    public int getSize() {
        return width * height;
    }

    public Set<Point> getNeighboursOfPoint(Point point) {
        Set<Point> neighbours = new HashSet<>();
        if (point == null)
            return neighbours;

        for (int x = -1; x <= 1; x++) {
            for (int y = -1; y <= 1; y++) {
                if (x == 0 && y == 0 || x * y != 0) continue;

                int newX = point.getX() + x;
                int newY = point.getY() + y;
                if (newX >= 0 && newX < width && newY >= 0 && newY < height)
                    neighbours.add(new Point(newX, newY));
            }
        }
        return neighbours;
    }


}
