/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegame.models.concrete.room;

import mazegame.models.abstracts.Room;

/**
 *
 * @author SCHETTINO
 */
public class ExitRoom extends Room {

    public ExitRoom() {
        super();
        isExit = true;
    }

    @Override
    public void enter() {
        super.enter();
        System.out.println("I am out! \\o/");
    }
}
