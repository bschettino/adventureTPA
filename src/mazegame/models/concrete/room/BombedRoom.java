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
public class BombedRoom extends Room {

    @Override
    public void enter() {
        super.enter();
        System.out.println("Warning! Bombed Room!");
    }
}
