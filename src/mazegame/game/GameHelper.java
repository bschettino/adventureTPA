/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegame.game;

import mazegame.models.abstracts.Item;
import mazegame.models.abstracts.Side;

/**
 *
 * @author SCHETTINO
 */
public class GameHelper {

    public static final char EAST_CHAR = 'd';
    public static final char SOUTH_CHAR = 's';
    public static final char WEST_CHAR = 'a';
    public static final char NORTH_CHAR = 'w';
    public static final char EXIT_CHAR = 'x';
    public static final char FIND_ITEM = 'f';
    public static final char USE_ITEM = 'u';
    public static final char ENTER_ROOM = 'e';
    public static final char PRINT_ROOM = 'p';
    public static final char PRINT_BAG = 'b';

    public static Side charToSide(char c) {
        Side side = null;
        switch (c) {
            case EAST_CHAR: {
                side = Side.EAST;
                break;
            }
            case SOUTH_CHAR: {
                side = Side.SOUTH;
                break;
            }
            case NORTH_CHAR: {
                side = Side.NORTH;
                break;
            }
            case WEST_CHAR: {
                side = Side.WEST;
                break;
            }
        }
        return side;
    }

    public static void printActions() {
        System.out.println("\nChoose one action: ");
        System.out.println("e : Enter");
        System.out.println("f : Find item");
        System.out.println("u : Use item\n");
    }

    public static void printInvalidAction() {
        System.out.println("\nInvalid action.\n");
    }

    public static void printItemNotFound() {
        System.out.println("\nFound nothing.\n");
    }

    public static void printItem(Item item) {
        System.out.println("\nFound " + item.getName() + ".\n");
    }

    public static void printEmptyBag() {
        System.out.println("\nYour bag is empty.\n");
    }

    public static void printSides() {
        System.out.println("\nChoose one side or type 'x' to exit or 'p' to print the current room or 'b' to print your bag: ");
        System.out.println("w : North");
        System.out.println("s : South");
        System.out.println("a : West");
        System.out.println("d : East");
    }
}
