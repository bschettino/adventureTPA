/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegame.factory;

import mazegame.models.abstracts.Door;
import mazegame.models.abstracts.Maze;
import mazegame.models.abstracts.Room;
import mazegame.models.abstracts.Wall;
import mazegame.models.concrete.room.ExitRoom;

/**
 *
 * @author SCHETTINO
 */
public abstract class MazeFactory {

    public abstract Maze makeMaze();

    public abstract Wall makeWall();

    public abstract Room makeRoom(Maze maze);

    public abstract Door makeDoor();

    public Room makeExit(Maze maze) {
        return new ExitRoom(maze);
    }
}
