package siro.revision.decorator.drinking;

import siro.revision.decorator.Beverage;

public class PeahTea extends Beverage {
    @Override
    public String description() {
        return "This is PeachTea";
    }

    @Override
    public double cost() {
        return 1.2;
    }
}
