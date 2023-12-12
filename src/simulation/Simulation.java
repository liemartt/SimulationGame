package simulation;

import simulation.actions.*;

import java.util.List;
import java.util.Scanner;

public class Simulation {
    public final EntityMap map;
    private final Renderer renderer;
    private final List<Action> initActions;
    private final List<Action> turnActions;
    public Simulation() {
        map = new EntityMap();
        renderer = new Renderer(this);
        initActions = List.of(new HerbivoreSpawnAction(), new PredatorSpawnAction(), new GrassSpawnAction(), new RockSpawnAction(), new TreeSpawnAction());
        turnActions = List.of(new MakeMovesAction(), new MissingGrassSpawnAction(), new CheckHerbivoresAction());
    }


    public void nextTurn() {
        turnActions.forEach(x -> x.doAction(map));
    }

    public void startSimulation() throws InterruptedException {
        initActions.forEach(x->x.doAction(map));
        while (true) {
            System.out.println("Choose action : 1.Start simulation(10 steps) 2.Make a step 3.Pause simulation 4.Stop simulation");
            Scanner scanner = new Scanner(System.in);
            int choise = scanner.nextInt();
            switch (choise) {
                case 1->{
                    for (int i = 0; i < 10; i++) {
                        nextTurn();
                        renderer.drawMap();
                        Thread.sleep(1000);
                    }
                }
                case 2 -> {
                    nextTurn();
                    renderer.drawMap();
                }
                case 3 -> {
                    renderer.drawMap();
                    pauseSimulation();
                }
                case 4 -> {
                    renderer.clearConsole();
                    System.out.println("Bye-Bye");
                    System.exit(1);
                }
                default -> {
                    System.out.println("Incorrect input");
                    System.exit(-1);
                }
            }
        }
    }

    public void pauseSimulation() {
        System.out.println("Game paused");
    }
}
