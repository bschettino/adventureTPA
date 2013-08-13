/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegame.models.concrete.room;

import mazegame.models.abstracts.Maze;
import mazegame.models.abstracts.Room;
import mazegame.models.abstracts.Side;

/**
 *
 * @author SCHETTINO
 */
public class EnchantedRoom extends Room {

    public EnchantedRoom(Maze maze) {
        super(maze);
    }

    @Override
    public void enter() {
        super.enter();
        System.out.println("\nAwesome! Enchanted Room!\n");
    }
}
