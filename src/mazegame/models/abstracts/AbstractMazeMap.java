/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegame.models.abstracts;

import mazegame.factory.MazeFactory;

/**
 *
 * @author SCHETTINO
 */
public abstract class AbstractMazeMap {

    public abstract Maze createMaze(MazeFactory factory);
}
