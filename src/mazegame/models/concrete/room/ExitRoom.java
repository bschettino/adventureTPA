/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegame.models.concrete.room;

import mazegame.models.abstracts.Maze;
import mazegame.models.abstracts.Room;

/**
 *
 * @author SCHETTINO
 */
public class ExitRoom extends Room {

    public ExitRoom(Maze maze) {
        super(maze);
        isExit = true;
    }

    @Override
    public void enter() {
        super.enter();
    }

    @Override
    public void printRoom() {
        System.out.println("\n\nI am out! \\o/");
    }
}
