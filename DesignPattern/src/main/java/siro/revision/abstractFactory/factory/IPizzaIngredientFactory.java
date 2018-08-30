package siro.revision.abstractFactory.factory;

import siro.revision.abstractFactory.intgrident.ICheese;
import siro.revision.abstractFactory.intgrident.ISauce;

public interface IPizzaIngredientFactory {
    ICheese createCheese();
    ISauce createSauce();
}
