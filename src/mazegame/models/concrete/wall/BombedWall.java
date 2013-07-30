/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegame.models.concrete.wall;

import mazegame.models.abstracts.Wall;

/**
 *
 * @author SCHETTINO
 */
public class BombedWall extends Wall {

    @Override
    public void enter() {
        System.out.println("OMG! Bombed Wall!");
    }
}
