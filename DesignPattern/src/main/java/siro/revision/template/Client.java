package siro.revision.template;

import siro.revision.decorator.Beverage;

public class Client {
    public static void main(String[] args) {
        BeverageSequence b = new CoffeeBeverage();
        b.makingBeverage();
        //
        System.out.println("---------------------------------------------------");
        BeverageSequence t = new TeaBeverage();
        t.makingBeverage();
    }
}
