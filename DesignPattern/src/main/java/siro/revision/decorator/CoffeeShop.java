package siro.revision.decorator;

import siro.revision.decorator.drinking.PeahTea;
import siro.revision.decorator.toping.BlackPearl;

public class CoffeeShop {
    public static void main(String[] args) {
        Beverage peachTea = new PeahTea();
        System.out.println(peachTea.cost());
        //
        Beverage peachTeaWithBlackPearl = new BlackPearl(peachTea);
        System.out.println(peachTeaWithBlackPearl.cost());
        //double blackPearl
        peachTeaWithBlackPearl = new BlackPearl(peachTeaWithBlackPearl);
        System.out.println(peachTeaWithBlackPearl.cost());
    }
}
