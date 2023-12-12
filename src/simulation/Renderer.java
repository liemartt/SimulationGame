package simulation;

import simulation.entities.Entity;

import java.util.Scanner;

public class Renderer {
    private final EntityMap map;

    public Renderer(Simulation simulation) {
        Scanner scanner = new Scanner(System.in);
        map = simulation.map;
    }

    public void drawMap() {
        clearConsole();
        for (int i = 0; i < map.getHeight(); i++) {
            for (int j = 0; j < map.getWidth(); j++) {
                Point p = new Point(j, i);
                Entity entity = map.get(p);
                if (entity == null) System.out.print("\uD83D\uDFEB");//🟫
                else System.out.print(entity);
            }
            System.out.println();
        }
    }

    public void clearConsole() {
        System.out.print("\033[H\033[J");
        System.out.flush();
    }
}
