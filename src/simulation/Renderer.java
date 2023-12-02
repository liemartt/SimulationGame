package simulation;

import java.util.Scanner;

public class Renderer {
    private Scanner scanner;
    private Simulation simulation;
    private EntityMap map;

    public Renderer(Simulation simulation) {
        scanner = new Scanner(System.in);
        this.simulation = simulation;
        map = simulation.map;
    }

    public void drawMap() {
        clearConsole();
        for (int i = 0; i < map.getHeight(); i++) {
            for (int j = 0; j < map.getWidth(); j++) {
                Point p = new Point(j, i);
                Entity entity = map.getMap().get(p);
                if (entity == null) System.out.print("\uD83D\uDFEB");//🟫
                else System.out.print(entity.toString());
            }
            System.out.println();
        }
    }

    private void clearConsole() {
        System.out.print("\033[H\033[J");
        System.out.flush();
    }

    public void start() {
        while (true) {
            System.out.println("Choose action : 1.Make a step 2.Pause simulation 3.Stop simulation");
            int choise = scanner.nextInt();
            switch (choise) {
                case 1 -> {
                    simulation.nextTurn();
                    drawMap();
                }
                case 2 -> {
                    simulation.pauseSimulation();
                    drawMap();
                }
                case 3 -> {
                    System.out.println("Bye-Bye");
                    System.exit(1);
                }
            }
        }
    }
}
