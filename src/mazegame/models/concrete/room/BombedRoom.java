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
public class BombedRoom extends Room {

    public BombedRoom(Maze maze) {
        super(maze);
    }

    
    @Override
    public void enter() {
        super.enter();
        System.out.println("\nWarning! Bombed Room!\n");
    }
}
