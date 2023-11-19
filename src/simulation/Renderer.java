package simulation;

import java.util.Scanner;

public class Renderer {
    Scanner scanner;
    Simulation simulation;

    public Renderer(Simulation simulation) {
        scanner = new Scanner(System.in);
        this.simulation = simulation;
    }
    public void drawMap(){
        EntityMap map = simulation.map;
        for (int i = 0; i < 2*map.getWidth()+4; i++) {
            System.out.print("――");
            if(i==map.getWidth()+1) System.out.println();
        }
        System.out.println();

        for (int i = 0; i < map.getHeight(); i++) {
            for (int j = 0; j < map.getWidth(); j++) {
                Point p = new Point(j, i);
                Entity entity = map.getMap().get(p);
                if(entity==null) System.out.print(".   ");
                else System.out.print(entity.getClass().toString().split("\\.")[1].charAt(0)+"   ");
            }
            System.out.println();
        }

        for (int i = 0; i < 2*map.getWidth()+4; i++) {
            System.out.print("――");
            if(i==map.getWidth()+1) System.out.println();
        }

    }
    private void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public void start(){
        drawMap();
        while (true){
            int choise = scanner.nextInt();
            if(choise==1){
                simulation.nextTurn();
                this.clearScreen();
                this.drawMap();
            }
        }
    }
}
