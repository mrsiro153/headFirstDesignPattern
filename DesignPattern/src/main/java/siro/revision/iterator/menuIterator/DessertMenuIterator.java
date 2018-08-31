package siro.revision.iterator.menuIterator;

import siro.revision.iterator.IIterator;
import siro.revision.iterator.MenuItem;
import siro.revision.iterator.menu.DessertMenu;

public class DessertMenuIterator implements IIterator {
    private DessertMenu dessertMenu;
    private Integer position = 0;
    private Integer size;

    public DessertMenuIterator(DessertMenu dessertMenu) {
        this.dessertMenu = dessertMenu;
        this.size = dessertMenu.getMenuItems().size();
    }

    @Override
    public boolean hasNext() {
        return position < size;
    }

    @Override
    public Object next() {
        MenuItem m = dessertMenu.getMenuItems().get(position);
        position += 1;
        return m;
    }

    @Override
    public void remove() {
        //remove item here
    }
}
