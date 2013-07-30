/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegame;

import java.io.IOException;
import java.util.Scanner;
import mazegame.factory.EnchantedMazeFactory;
import mazegame.factory.MazeFactory;
import mazegame.game.Game;
import mazegame.models.abstracts.Door;
import mazegame.models.abstracts.MapSite;
import mazegame.models.abstracts.Maze;
import mazegame.models.abstracts.Room;
import mazegame.models.abstracts.Side;

/**
 *
 * @author SCHETTINO
 */
public class MazeGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Maze maze = createMaze(new EnchantedMazeFactory());
        Scanner keyboard = new Scanner(System.in);
        Game.setCurrentRoom(maze.roomNo(0));
        boolean fim = false;
        while (!fim) {
            Game.getCurrentRoom().printRoom();
            char escolha = keyboard.nextLine().toLowerCase().charAt(0);
            Side side = Game.charToSide(escolha);
            if ((side == null)) {
                if (escolha == Game.EXIT_CHAR) {
                    fim = true;
                }
            } else {
                MapSite site = Game.getCurrentRoom().getSide(side);
                site.enter();
                if (Game.getCurrentRoom().isExit()) {
                    fim = true;
                }
            }

        }
    }

    public static Maze createMaze(MazeFactory factory) {
        Maze maze = factory.makeMaze();

        Room r1 = factory.makeRoom();
        r1.setSide(Side.NORTH, factory.makeWall());
        r1.setSide(Side.SOUTH, factory.makeWall());
        r1.setSide(Side.WEST, factory.makeWall());

        Room r2 = factory.makeRoom();
        r2.setSide(Side.EAST, factory.makeWall());
        r2.setSide(Side.SOUTH, factory.makeWall());

        Door theDoor = factory.makeDoor();
        theDoor.setRoom1(r1);
        theDoor.setRoom2(r2);

        r1.setSide(Side.EAST, theDoor);
        r2.setSide(Side.WEST, theDoor);

        Room r3 = factory.makeExit();

        Door secondDoor = factory.makeDoor();
        secondDoor.setRoom1(r2);
        secondDoor.setRoom2(r3);
        r2.setSide(Side.NORTH, secondDoor);
        r3.setSide(Side.SOUTH, secondDoor);

        maze.addRoom(r1);
        maze.addRoom(r2);
        maze.addRoom(r3);

        return maze;
    }
}
