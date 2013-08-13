/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegame.models.concrete.item;

import mazegame.models.abstracts.Item;
import mazegame.models.concrete.action.ActionOpenDoor;

/**
 *
 * @author SCHETTINO
 */
public class Key extends Item {

    public Key() {
        this.name = "Key";
        this.action = new ActionOpenDoor();
    }
}
