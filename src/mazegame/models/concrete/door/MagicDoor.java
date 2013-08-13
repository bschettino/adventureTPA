/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegame.models.concrete.door;

import mazegame.models.abstracts.Door;
import mazegame.models.abstracts.Room;

/**
 *
 * @author SCHETTINO
 */
public class MagicDoor extends Door {

    public MagicDoor() {
        super();
    }

    public MagicDoor(Room r1, Room r2) {
        super(r1, r2);
    }

    @Override
    public void enter() {
        super.enter();
    }

    @Override
    protected void printMsg() {
        System.out.println("\nIs this a magic doooooooor?\n");
    }
}
