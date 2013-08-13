/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegame.models.concrete.action;

import mazegame.game.GameObjects;
import mazegame.models.abstracts.Action;
import mazegame.models.abstracts.Door;
import mazegame.models.abstracts.MapSite;
import mazegame.models.abstracts.Room;
import mazegame.models.abstracts.Side;

/**
 *
 * @author SCHETTINO
 */
public class ActionOpenDoor extends Action {

    @Override
    public void perform(MapSite site) {
        if (site instanceof Door) {
            Door door = (Door) site;
            if (!door.isOpen()) {
                door.setOpen(true);
                System.out.println("Yes! I opened the door!");
            } else {
                System.out.println("This door is already open.");
            }
        } else {
            System.out.println("You can only use this item on a door.");
        }
    }
}
