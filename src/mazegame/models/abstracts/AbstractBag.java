/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegame.models.abstracts;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author SCHETTINO
 */
public abstract class AbstractBag {

    protected List<Item> items;

    public abstract Iterator<Item> createIterator();

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void add(Item item) {
        this.items.add(item);
    }

    public boolean isEmpty() {
        return this.items.isEmpty();
    }
    
    public int size(){
        return this.items.size();
    }
    
    public Item get(int i){
        return this.items.get(i);
    }
    
    public Item remove(int i){
        return this.items.remove(i);
    }
}
