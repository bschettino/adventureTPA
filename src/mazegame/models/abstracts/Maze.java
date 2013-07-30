/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegame.models.abstracts;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author SCHETTINO
 */
public abstract class Maze {

    protected Map<Integer, Room> rooms;
    protected Room currentRoom;

    public Maze() {
        rooms = new HashMap<>();
    }

    public void addRoom(Room r) {
        rooms.put(r.roomNumber(), r);
    }

    public Room roomNo(int number) {
        return rooms.get(number);
    }
}
