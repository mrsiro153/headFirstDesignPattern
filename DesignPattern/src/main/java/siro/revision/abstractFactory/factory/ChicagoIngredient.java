package siro.revision.abstractFactory.factory;

import siro.revision.abstractFactory.intgrident.ICheese;
import siro.revision.abstractFactory.intgrident.ICheese_VN;
import siro.revision.abstractFactory.intgrident.ISauce;
import siro.revision.abstractFactory.intgrident.ISauce_Bean;

public class ChicagoIngredient implements IPizzaIngredientFactory {
    @Override
    public ICheese createCheese() {
        return new ICheese_VN();
    }

    @Override
    public ISauce createSauce() {
        return new ISauce_Bean();
    }
}
