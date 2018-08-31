package siro.revision.composite;

public class MenuItem extends MenuComponent {
    //this is leaf
    private String name;
    private String description;
    private String vegetarian;
    private double price;

    public MenuItem(String name, String description, String vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println(this.toString());
        System.out.println("---------");
    }

    @Override
    public void add(MenuComponent m) {
        //because you are leaf, so you can not add any other leaf or node
    }

    @Override
    public void remove(MenuComponent m) {
        //because you are leaf, so you can not add any other leaf or node
    }

    @Override
    public MenuComponent getChild(int index) {
        //because you are leaf, so you can not add any other leaf or node
        throw new NullPointerException("Can not get child on LEAF");
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
