package siro.revision.composite;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {
    //this is node
    private String name;
    private String description;
    private String vegetarian;
    private double price;
    //
    private List<MenuComponent> children;

    public Menu(String name, String description, String vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
        children = new ArrayList<>();
    }

    @Override
    public void print() {
        for(MenuComponent m: children){
            m.print();
            //we can apply iterator pattern here!
        }
    }

    @Override
    public void add(MenuComponent m) {
        children.add(m);
    }

    @Override
    public void remove(MenuComponent m) {
        children.remove(m);
    }

    @Override
    public MenuComponent getChild(int index) {
        return children.get(index);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public String isVegetarian() {
        return this.vegetarian;
    }
}
