/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegame;

import java.io.IOException;
import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;
import mazegame.factory.EnchantedMazeFactory;
import mazegame.factory.MazeFactory;
import mazegame.game.GameHelper;
import mazegame.models.abstracts.Door;
import mazegame.models.abstracts.MapSite;
import mazegame.models.abstracts.Maze;
import mazegame.models.abstracts.Room;
import mazegame.models.abstracts.Side;

/**
 *
 * @author SCHETTINO
 */
public class MazeGame implements Observer {

    private static Maze maze;

    public static void main(String[] args) throws IOException {
        maze = createMaze(new EnchantedMazeFactory());
        MazeGame game = new MazeGame();
        maze.addObserver(game);
        game.play();
    }

    public void play() {
        Scanner keyboard = new Scanner(System.in);
        maze.setCurrentRoom(maze.roomNo(0));
        boolean fim = false;
        while (!fim) {
            char escolha = keyboard.nextLine().toLowerCase().charAt(0);
            Side side = GameHelper.charToSide(escolha);
            if ((side == null)) {
                if (escolha == GameHelper.EXIT_CHAR) {
                    fim = true;
                }
            } else {
                MapSite site = maze.getCurrentRoom().getSide(side);
                site.enter();
                if (maze.getCurrentRoom().isExit()) {
                    fim = true;
                }
            }

        }
    }

    public static Maze createMaze(MazeFactory factory) {
        Maze factoryMaze = factory.makeMaze();

        Room r1 = factory.makeRoom(factoryMaze);
        r1.setSide(Side.NORTH, factory.makeWall());
        r1.setSide(Side.SOUTH, factory.makeWall());
        r1.setSide(Side.WEST, factory.makeWall());

        Room r2 = factory.makeRoom(factoryMaze);
        r2.setSide(Side.EAST, factory.makeWall());
        r2.setSide(Side.SOUTH, factory.makeWall());

        Door theDoor = factory.makeDoor();
        theDoor.setRoom1(r1);
        theDoor.setRoom2(r2);

        r1.setSide(Side.EAST, theDoor);
        r2.setSide(Side.WEST, theDoor);

        Room r3 = factory.makeExit(factoryMaze);

        Door secondDoor = factory.makeDoor();
        secondDoor.setRoom1(r2);
        secondDoor.setRoom2(r3);
        r2.setSide(Side.NORTH, secondDoor);
        r3.setSide(Side.SOUTH, secondDoor);

        factoryMaze.addRoom(r1);
        factoryMaze.addRoom(r2);
        factoryMaze.addRoom(r3);

        return factoryMaze;
    }

    @Override
    public void update(Observable o, Object o1) {
        maze.getCurrentRoom().printRoom();
    }
}
