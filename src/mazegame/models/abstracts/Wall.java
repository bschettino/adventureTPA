/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegame.models.abstracts;

/**
 *
 * @author SCHETTINO
 */
public abstract class Wall implements MapSite {

    private Item item;

    @Override
    public Item getItem() {
        return item;
    }

    @Override
    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public void enter() {
    }

    @Override
    public String legend() {
        return "W";
    }
}
