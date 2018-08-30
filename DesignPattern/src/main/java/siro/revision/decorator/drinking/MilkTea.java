package siro.revision.decorator.drinking;

import siro.revision.decorator.Beverage;

public class MilkTea extends Beverage {
    @Override
    public String description() {
        return "This is MilkTea";
    }

    @Override
    public double cost() {
        return 2.3;
    }
}
