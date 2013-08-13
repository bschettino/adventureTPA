/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegame.game;

import java.util.Iterator;
import mazegame.models.abstracts.AbstractBag;
import mazegame.models.abstracts.Item;
import mazegame.models.abstracts.Maze;

/**
 *
 * @author SCHETTINO
 */
public class GameObjects {

    private static Maze _maze;
    private static AbstractBag _bag;

    public static Maze getMaze() {
        return _maze;
    }

    public static void setMaze(Maze maze) {
        GameObjects._maze = maze;
    }

    public static AbstractBag getBag() {
        return _bag;
    }

    public static void setBag(AbstractBag _bag) {
        GameObjects._bag = _bag;
    }

    public static void printBag() {
        Iterator<Item> iterator = _bag.createIterator();
        if (iterator.hasNext()) {
            System.out.println("\nChoose one item:");
            int i = 0;
            while (iterator.hasNext()) {
                Item item = iterator.next();
                System.out.println(i++ + " : " + item.getName());
            }
        } else {
            GameHelper.printEmptyBag();
        }

    } 
}
