package siro.revision.factoryMethod;

import siro.revision.factoryMethod.creator.ChicagoPizzaStore;
import siro.revision.factoryMethod.creator.PizzaStore;
import siro.revision.factoryMethod.product.Pizza;

public class Client {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new ChicagoPizzaStore();
        Pizza p = pizzaStore.orderPizza("fish");
        System.out.println("I order "+p.getClass().getName());
    }
}
