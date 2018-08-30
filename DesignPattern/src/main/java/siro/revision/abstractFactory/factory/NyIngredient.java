package siro.revision.abstractFactory.factory;

import siro.revision.abstractFactory.intgrident.ICheese;
import siro.revision.abstractFactory.intgrident.ICheese_US;
import siro.revision.abstractFactory.intgrident.ISauce;
import siro.revision.abstractFactory.intgrident.ISauce_Soy;

public class NyIngredient implements IPizzaIngredientFactory {
    @Override
    public ICheese createCheese() {
        return new ICheese_US();
    }

    @Override
    public ISauce createSauce() {
        return new ISauce_Soy();
    }
}
