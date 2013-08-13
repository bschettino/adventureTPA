/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegame.game;

import java.util.List;
import mazegame.models.abstracts.Item;
import mazegame.models.abstracts.Maze;

/**
 *
 * @author SCHETTINO
 */
public class GameObjects {

    private static Maze _maze;
    private static List<Item> _bag;

    public static Maze getMaze() {
        return _maze;
    }

    public static void setMaze(Maze maze) {
        GameObjects._maze = maze;
    }

    public static List<Item> getBag() {
        return _bag;
    }

    public static void setBag(List<Item> _bag) {
        GameObjects._bag = _bag;
    }

    public static void printBag() {
        if (_bag.isEmpty()) {
            GameHelper.printEmptyBag();
        } else {
            System.out.println("\nChoose one item:");
            for (int i = 0; i < _bag.size(); i++) {
                Item item = _bag.get(i);
                System.out.println(i + " : " + item.getName());
            }
        }
    }
}
