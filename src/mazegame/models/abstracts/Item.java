/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mazegame.models.abstracts;

/**
 *
 * @author SCHETTINO
 */
public abstract class Item {

    protected String name;
    protected Action action;

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public boolean use(MapSite site) {
        return action.perform(site);
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }
    
}
