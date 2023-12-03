package simulation;

import simulation.actions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Simulation {
    public EntityMap map;
    private final Renderer renderer;
    private final List<Action> initActions;
    private final List<Action> turnActions;

    public Simulation() {
        map = new EntityMap();
        renderer = new Renderer(this);
        initActions = List.of(new HerbivoreSpawnAction(), new PredatorSpawnAction(), new GrassSpawnAction(), new RockSpawnAction(), new TreeSpawnAction());
        turnActions = List.of(new MakeMovesAction(), new MissingGrassSpawnAction());

    }


    public void nextTurn() {
        turnActions.forEach(x -> x.doAction(map));

    }

    public void startSimulation() {
        initActions.forEach(x -> x.doAction(map));
        renderer.start();

    }

    public void pauseSimulation() {

    }
}
