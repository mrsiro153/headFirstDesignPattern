package siro.revision.composite;

public class MenuComponent {
    public void print() {
        throw new NullPointerException("You need override this function");
    }

    public void add(MenuComponent m) {
        throw new NullPointerException("You need override this function");
    }

    public void remove(MenuComponent m) {
        throw new NullPointerException("You need override this function");
    }

    public MenuComponent getChild(int index) {
        throw new NullPointerException("You need override this function");
    }

    public String getName() {
        throw new NullPointerException("You need override this function");
    }

    public String getDescription() {
        throw new NullPointerException("You need override this function");
    }

    public String isVegetarian() {
        throw new NullPointerException("You need override this function");
    }

}
