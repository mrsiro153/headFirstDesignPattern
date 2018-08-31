package siro.revision.iterator.menu;

import siro.revision.iterator.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class DinnerMenu {
    private List<MenuItem> menuItems;

    public DinnerMenu() {
        createDinnerMenu();
    }

    //
    private void createDinnerMenu() {
        this.menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("Salmon", 14, "grill salmon with lemon"));
        menuItems.add(new MenuItem("Sheep clam", 88, "sheep clam with high temperature"));
        menuItems.add(new MenuItem("Duck", 30, "Soup duck with vegetable"));
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }
}
