/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegame.models.abstracts;

/**
 *
 * @author SCHETTINO
 */
public interface MapSite {
    public void setItem(Item item);
    public Item getItem();
    public void enter();
    public String legend();
}   
