/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegame.models.concrete.bag;

import java.util.ArrayList;
import java.util.Iterator;
import mazegame.iterator.BagIterator;
import mazegame.models.abstracts.AbstractBag;
import mazegame.models.abstracts.Item;

/**
 *
 * @author SCHETTINO
 */
public class Bag extends AbstractBag {

    public Bag() {
        this.items = new ArrayList<Item>();
    }

    @Override
    public Iterator<Item> createIterator() {
        return new BagIterator(items);
    }
}
