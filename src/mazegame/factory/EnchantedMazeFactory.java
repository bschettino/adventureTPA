/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegame.factory;

import mazegame.models.abstracts.Door;
import mazegame.models.abstracts.Maze;
import mazegame.models.abstracts.Room;
import mazegame.models.abstracts.Wall;
import mazegame.models.concrete.door.MagicDoor;
import mazegame.models.concrete.maze.EnchantedMaze;
import mazegame.models.concrete.room.EnchantedRoom;
import mazegame.models.concrete.room.ExitRoom;
import mazegame.models.concrete.wall.SimpleWall;

/**
 *
 * @author SCHETTINO
 */
public class EnchantedMazeFactory extends MazeFactory {

    @Override
    public Maze makeMaze() {
        return new EnchantedMaze();
    }

    @Override
    public Wall makeWall() {
        return new SimpleWall();
    }

    @Override
    public Room makeRoom(Maze maze) {
        return new EnchantedRoom(maze);
    }

    @Override
    public Door makeDoor() {
        return new MagicDoor();
    }
    
    @Override
    public Room makeExit(Maze maze) {
        return new ExitRoom(maze);
    }
}
