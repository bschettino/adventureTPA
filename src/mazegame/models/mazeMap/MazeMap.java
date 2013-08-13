/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegame.models.mazeMap;

import mazegame.factory.MazeFactory;
import mazegame.models.abstracts.AbstractMazeMap;
import mazegame.models.abstracts.Door;
import mazegame.models.abstracts.Maze;
import mazegame.models.abstracts.Room;
import mazegame.models.abstracts.Side;
import mazegame.models.abstracts.Wall;
import mazegame.models.concrete.item.Key;

/**
 *
 * @author SCHETTINO
 */
public class MazeMap extends AbstractMazeMap {

    @Override
    public Maze createMaze(MazeFactory factory) {
        Maze factoryMaze = factory.makeMaze();

        Room r1 = factory.makeRoom(factoryMaze);
        r1.setSide(Side.NORTH, factory.makeWall());
        r1.setSide(Side.SOUTH, factory.makeWall());
        r1.setSide(Side.WEST, factory.makeWall());

        Wall w = (Wall) r1.getSide(Side.SOUTH);
        w.setItem(new Key());

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
        secondDoor.setOpen(false);
        r2.setSide(Side.NORTH, secondDoor);
        r3.setSide(Side.SOUTH, secondDoor);

        factoryMaze.addRoom(r1);
        factoryMaze.addRoom(r2);
        factoryMaze.addRoom(r3);

        return factoryMaze;
    }
}
