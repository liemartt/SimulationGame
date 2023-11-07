package simulation;

import java.util.*;

public class PathFinding {
    public List<Point> findPath(EntityMap map, Point startPoint, Class<? extends Entity> target) {

        List<Point> path;
        List<Point> tempPath;
        List<Point> visitedPoints = new ArrayList<>();
        Queue<List<Point>> queue = new LinkedList<>();
        queue.add(List.of(startPoint));

        while (!queue.isEmpty()) {
            path = queue.poll();
            Point lastPoint = path.get(path.size() - 1);
            for (Point point : map.getNeighboursOfPoint(lastPoint)) {
                Entity entity = map.getMap().get(point);
                if (entity == null) {
                    if (!visitedPoints.contains(point)) {
                        visitedPoints.add(point);
                        tempPath = new ArrayList<>(path);
                        tempPath.add(point);
                        queue.add(tempPath);
                    }
                } else if (target == entity.getClass()) {
                    path.add(point);
                    return path;
                }
            }
        }
        return null;
    }

}
