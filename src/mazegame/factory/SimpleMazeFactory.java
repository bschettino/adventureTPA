/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegame.factory;

import mazegame.models.abstracts.Door;
import mazegame.models.abstracts.Maze;
import mazegame.models.abstracts.Room;
import mazegame.models.abstracts.Wall;
import mazegame.models.concrete.door.SimpleDoor;
import mazegame.models.concrete.maze.SimpleMaze;
import mazegame.models.concrete.room.ExitRoom;
import mazegame.models.concrete.room.SimpleRoom;
import mazegame.models.concrete.wall.SimpleWall;

/**
 *
 * @author SCHETTINO
 */
public class SimpleMazeFactory extends MazeFactory {

    @Override
    public Maze makeMaze() {
        return new SimpleMaze();
    }

    @Override
    public Wall makeWall() {
        return new SimpleWall();
    }

    @Override
    public Room makeRoom() {
        return new SimpleRoom();
    }

    @Override
    public Door makeDoor() {
        return new SimpleDoor();
    }

    @Override
    public Room makeExit() {
        return new ExitRoom();
    }
}
