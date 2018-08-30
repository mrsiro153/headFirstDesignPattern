package siro.revision.decorator.toping;

import siro.revision.decorator.Beverage;
import siro.revision.decorator.Toping;

public class BlackPearl extends Toping {
    private Beverage baseBeverage;

    public BlackPearl(Beverage baseBeverage) {
        this.baseBeverage = baseBeverage;
    }

    @Override
    public String description() {
        return baseBeverage.description() + ", with BlackPearl";
    }

    @Override
    public double cost() {
        return 0.5 + baseBeverage.cost();
    }
}
