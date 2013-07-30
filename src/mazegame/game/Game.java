/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegame.game;

import mazegame.models.abstracts.Room;
import mazegame.models.abstracts.Side;

/**
 *
 * @author SCHETTINO
 */
public class Game {

    public static final char EAST_CHAR = 'd';
    public static final char SOUTH_CHAR = 's';
    public static final char WEST_CHAR = 'a';
    public static final char NORTH_CHAR = 'w';
    public static final char EXIT_CHAR = 'x';
    private static Room currentRoom;

    public static Room getCurrentRoom() {
        return currentRoom;
    }

    public static void setCurrentRoom(Room currentRoom) {
        Game.currentRoom = currentRoom;
    }

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
}
