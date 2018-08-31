package siro.revision.iterator;

import siro.revision.iterator.menu.DessertMenu;
import siro.revision.iterator.menu.DinnerMenu;
import siro.revision.iterator.menuIterator.DessertMenuIterator;
import siro.revision.iterator.menuIterator.DinnerMenuIterator;

public class Client {
    public static void main(String[] args) {
        IIterator di = new DinnerMenuIterator(new DinnerMenu());
        System.out.println("Dinner menu Item:");
        while (di.hasNext()) {
            MenuItem m = (MenuItem) di.next();
            System.out.println("dish: " + m.getName());
            System.out.println("waiting time: " + m.getWaitingTime());
            System.out.println("description: " + m.getDescription());
            System.out.println("-----------------------------");
        }
        System.out.println("*************************************************");
        System.out.println("Dessert menu item: ");
        IIterator dii = new DessertMenuIterator(new DessertMenu());
        while (dii.hasNext()){
            MenuItem m = (MenuItem) dii.next();
            System.out.println("dish: " + m.getName());
            System.out.println("waiting time: " + m.getWaitingTime());
            System.out.println("description: " + m.getDescription());
            System.out.println("-----------------------------");
        }
    }
}
