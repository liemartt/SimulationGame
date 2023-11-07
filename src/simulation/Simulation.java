package simulation;

import simulation.actions.*;

import java.util.ArrayList;
import java.util.List;

public class Simulation {
    private EntityMap map;
    private Renderer renderer;
    private List<Action> initActions;
    private List<Action> turnActions;
    private int counter;
    public Simulation() {
        map = new EntityMap();
        renderer = new Renderer();
        initActions = List.of(new HerbivoreSpawnAction(), new PredatorSpawnAction(), new GrassSpawnAction(), new RockSpawnAction(), new TreeSpawnAction());
        turnActions = List.of(new MakeMovesAction(), new GrassSpawnAction());
        counter = 0;
    }



    public int getCounter() {
        return counter;
    }
    public void nextTurn(){

    }
    public void startSimulation(){

    }
    public void pauseSimulation(){

    }
}
