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
public class SimpleDoor extends Door {

    public SimpleDoor(Room r1, Room r2) {
        super(r1, r2);
    }

    public SimpleDoor() {
        super();
    }

    @Override
    public void enter() {
        super.enter();
    }

    @Override
    protected void printMsg() {
        System.out.println("\nLet's see what is on the other side of this door...\n");
    }
}
