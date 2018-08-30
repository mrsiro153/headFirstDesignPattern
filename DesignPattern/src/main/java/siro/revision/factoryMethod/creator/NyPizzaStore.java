package siro.revision.factoryMethod.creator;


import siro.revision.factoryMethod.product.Pizza;
import siro.revision.factoryMethod.product.nyPizza.NyCheesePizza;
import siro.revision.factoryMethod.product.nyPizza.NyFishPizza;
import siro.revision.factoryMethod.product.nyPizza.NyVegetablePizza;

public class NyPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new NyCheesePizza();
            case "veg":
                return new NyVegetablePizza();
            case "fish":
                return new NyFishPizza();
        }
        return null;
    }
}
