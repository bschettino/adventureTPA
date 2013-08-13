/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegame.iterator;

import java.util.Iterator;
import java.util.List;
import mazegame.models.abstracts.Item;

/**
 *
 * @author SCHETTINO
 */
public class BagIterator implements Iterator<Item> {

    private List<Item> items;
    private int position = 0;

    public BagIterator(List<Item> items) {
        this.items = items;
    }

    @Override
    public Item next() {
        Item item = items.get(position);
        position++;
        return item;
    }

    @Override
    public boolean hasNext() {
        if (position < items.size()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void remove() {
        try {
            items.remove(position);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Impossible to remove item");
        }
    }
}
