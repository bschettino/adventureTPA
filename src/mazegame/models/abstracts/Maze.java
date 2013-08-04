/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegame.models.abstracts;

import java.util.HashMap;
import java.util.Map;
import java.util.Observable;

/**
 *
 * @author SCHETTINO
 */
public abstract class Maze extends Observable {

    protected Map<Integer, Room> rooms;
    private Room currentRoom;

    public Maze() {
        rooms = new HashMap<>();
    }

    public void addRoom(Room r) {
        rooms.put(r.roomNumber(), r);
    }

    public Room roomNo(int number) {
        return rooms.get(number);
    }

    public void setCurrentRoom(Room room) {
        currentRoom = room;
        setChanged();
        notifyObservers(currentRoom);
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }
}
