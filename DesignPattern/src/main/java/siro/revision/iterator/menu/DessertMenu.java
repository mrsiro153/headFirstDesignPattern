package siro.revision.iterator.menu;

import siro.revision.iterator.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class DessertMenu {
    private List<MenuItem> menuItems;

    public DessertMenu() {
        createDessertMenu();
    }

    private void createDessertMenu() {
        this.menuItems = new ArrayList<>();
        menuItems.add(new MenuItem("ice-cream", 5, "chocolate ice-cream"));
        menuItems.add(new MenuItem("fruit", 1, "dessert with banana"));
        menuItems.add(new MenuItem("milk tea", 3, "milk tea with incredible toping"));
        menuItems.add(new MenuItem("soft drink", 2, "Cocacola, pepsi, anything you want"));
    }
    //
    public List<MenuItem> getMenuItems(){
        return menuItems;
    }
}
