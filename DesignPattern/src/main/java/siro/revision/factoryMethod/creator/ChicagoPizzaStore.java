package siro.revision.factoryMethod.creator;

import siro.revision.factoryMethod.product.Pizza;
import siro.revision.factoryMethod.product.chicagoPizza.ChicagoCheesePizza;
import siro.revision.factoryMethod.product.chicagoPizza.ChicagoFishPizza;
import siro.revision.factoryMethod.product.chicagoPizza.ChicagoVegetablePizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new ChicagoCheesePizza();
            case "veg":
                return new ChicagoVegetablePizza();
            case "fish":
                return new ChicagoFishPizza();
        }
        return null;
    }
}
