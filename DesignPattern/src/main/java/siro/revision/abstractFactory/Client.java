package siro.revision.abstractFactory;

import siro.revision.abstractFactory.factory.IPizzaIngredientFactory;
import siro.revision.abstractFactory.factory.NyIngredient;

public class Client {
    public static void main(String[] args) {
        IPizzaIngredientFactory factory = new NyIngredient();
        System.out.println(factory.createCheese());
        System.out.println(factory.createSauce());
    }
}
