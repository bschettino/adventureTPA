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
import mazegame.models.concrete.maze.BombedMaze;
import mazegame.models.concrete.room.BombedRoom;
import mazegame.models.concrete.room.ExitRoom;
import mazegame.models.concrete.wall.BombedWall;

/**
 *
 * @author SCHETTINO
 */
public class BombedMazeFactory extends MazeFactory {

    @Override
    public Maze makeMaze() {
        return new BombedMaze();
    }

    @Override
    public Wall makeWall() {
        return new BombedWall();
    }

    @Override
    public Room makeRoom(Maze maze) {
        return new BombedRoom(maze);
    }

    @Override
    public Door makeDoor() {
        return new SimpleDoor();
    }

    @Override
    public Room makeExit(Maze maze) {
        return new ExitRoom(maze);
    }
}
