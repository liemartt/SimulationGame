package simulation;

import simulation.actions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Simulation {
    public EntityMap map;
    private Renderer renderer;
    private List<Action> initActions;
    private List<Action> turnActions;
    private int counter;
    public Simulation() {
        map = new EntityMap();
        renderer = new Renderer(this);
        initActions = List.of(new HerbivoreSpawnAction(), new PredatorSpawnAction(), new GrassSpawnAction(), new RockSpawnAction(), new TreeSpawnAction());
        turnActions = List.of(new MakeMovesAction());
        counter = 0;
    }

    public int getCounter() {
        return counter;
    }
    public void nextTurn(){
        turnActions.forEach(x->x.doAction(map));

    }
    public void startSimulation(){
        initActions.forEach(x->x.doAction(map));
        renderer.start();

    }
    public void pauseSimulation(){

    }
    //TODO test console start
    public static void main(String[] args) {
        new Simulation().startSimulation();

    }
}
