/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegame.models.abstracts;

/**
 *
 * @author SCHETTINO
 */
public abstract class Door implements MapSite {

    protected Room room1;
    protected Room room2;
    protected boolean open;
    private Maze maze;

    public Door() {
    }

    public Door(Room r1, Room r2) {
        room1 = r1;
        room2 = r2;
        open = false;
        this.maze = r1.getMaze();
    }

    @Override
    public void enter() {
        otherSideFrom(maze.getCurrentRoom()).enter();
    }

    @Override
    public String legend() {
        return "D";
    }

    public Room otherSideFrom(Room r) {
        if (r.roomNumber() == room1.roomNumber()) {
            return room2;
        } else {
            if (r.roomNumber() == room2.roomNumber()) {
                return room1;
            } else {
                return null;
            }
        }
    }

    public Room getRoom1() {
        return room1;
    }

    public void setRoom1(Room room1) {
        this.room1 = room1;
        this.maze = room1.getMaze();
    }

    public Room getRoom2() {
        return room2;
    }

    public void setRoom2(Room room2) {
        this.room2 = room2;
        this.maze = room2.getMaze();
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }
}
