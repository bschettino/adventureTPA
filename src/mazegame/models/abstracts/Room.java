/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegame.models.abstracts;

import java.util.HashMap;
import java.util.Map;
import mazegame.game.GameHelper;

/**
 *
 * @author SCHETTINO
 */
public abstract class Room implements MapSite {

    protected static int currentNumber = 0;
    protected Map<Enum, MapSite> sides;
    protected int number;
    protected boolean isExit;
    private Maze maze;

    public Room(Maze maze) {
        number = currentNumber++;
        sides = new HashMap<>();
        isExit = false;
        this.maze = maze;
    }

    @Override
    public void enter() {
        maze.setCurrentRoom(this);
    }

    public MapSite getSide(Side side) {
        return sides.get(side);
    }

    public void setSide(Side side, MapSite r) {
        sides.put(side, r);
    }

    public int roomNumber() {
        return number;
    }

    public Maze getMaze() {
        return maze;
    }

    public void printRoom() {
        String text = "";
        text += "         " + sides.get(Side.NORTH).legend() + "\n";
        text += "\n\n\n";
        text += sides.get(Side.WEST).legend() + "                  " + sides.get(Side.EAST).legend() + "\n";
        text += "\n\n\n";
        text += "         " + sides.get(Side.SOUTH).legend() + "\n";

        System.out.println(text);
    }

    public boolean isExit() {
        return isExit;
    }

    @Override
    public String legend() {
        return "R";
    }
}
