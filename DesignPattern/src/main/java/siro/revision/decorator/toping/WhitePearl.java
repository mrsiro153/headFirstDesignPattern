package siro.revision.decorator.toping;

import siro.revision.decorator.Beverage;
import siro.revision.decorator.Toping;

public class WhitePearl extends Toping {
    private Beverage baseBeverage;

    public WhitePearl(Beverage baseBeverage) {
        this.baseBeverage = baseBeverage;
    }

    @Override
    public String description() {
        return baseBeverage.description()+", with WhitePearl";
    }

    @Override
    public double cost() {
        return 0.7 + baseBeverage.cost();
    }
}
