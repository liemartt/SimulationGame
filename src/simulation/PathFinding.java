package simulation;

import java.util.*;

public class PathFinding {
    public List<Point> findPath(EntityMap map, Point startPoint, Class<? extends Entity> target) {

        List<Point> path;
        List<Point> tempPath;
        List<Point> visitedPoints = new ArrayList<>();
        Queue<List<Point>> queue = new LinkedList<>();
        queue.add(new ArrayList<>(Collections.singletonList(startPoint)));

        while (!queue.isEmpty()) {
            path = queue.poll();
            Point lastPoint = path.get(path.size() - 1);
            if(lastPoint==null) continue;
            for (Point point : map.getNeighboursOfPoint(lastPoint)) {
                Entity entity = map.getMap().get(point);
                if (entity == null) {
                    if (!visitedPoints.contains(point)) {
                        visitedPoints.add(point);
                        tempPath = new ArrayList<>(path);
                        tempPath.add(point);
                        queue.add(tempPath);
                    }
                } else if (target.equals( entity.getClass())) {
                    return path;
                }
            }
        }
        return null;
    }

}