package siro.revision.iterator.menuIterator;

import siro.revision.iterator.IIterator;
import siro.revision.iterator.MenuItem;
import siro.revision.iterator.menu.DinnerMenu;

public class DinnerMenuIterator implements IIterator {
    private DinnerMenu dinnerMenu;
    private Integer size;
    private Integer position = 0;

    public DinnerMenuIterator(DinnerMenu dinnerMenu) {
        this.dinnerMenu = dinnerMenu;
        this.size = dinnerMenu.getMenuItems().size();
    }

    @Override
    public boolean hasNext() {
        return position < size;
    }

    @Override
    public Object next() {
        MenuItem m = dinnerMenu.getMenuItems().get(position);
        position += 1;
        return m;
    }

    @Override
    public void remove() {
        //remove item here
    }
}
