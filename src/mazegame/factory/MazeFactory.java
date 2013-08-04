/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegame.factory;

import mazegame.models.abstracts.Door;
import mazegame.models.abstracts.Maze;
import mazegame.models.abstracts.Room;
import mazegame.models.abstracts.Wall;

/**
 *
 * @author SCHETTINO
 */
public abstract class MazeFactory {
    public abstract Maze makeMaze();
    public abstract Wall makeWall();
    public abstract Room makeRoom(Maze maze);
    public abstract Door makeDoor();
    public abstract Room makeExit(Maze maze);
}
