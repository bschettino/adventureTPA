/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegame.models.abstracts;

/**
 *
 * @author SCHETTINO
 */
public abstract class Wall implements MapSite {

    @Override
    public void enter() {
    }

    @Override
    public String legend() {
        return "W";
    }
}
