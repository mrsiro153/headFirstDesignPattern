package siro.revision.template;

public class CoffeeBeverage extends BeverageSequence {
    @Override
    void addToping() {
        System.out.println("This is Coffee, add coffee toping");
    }

    @Override
    void packageToGlass() {
        System.out.println("This is coffee, package it to HIGH glass");
    }

    @Override
    protected boolean allowToping() {
        return getUserDesire();
    }

    //
    private Boolean getUserDesire() {
        return true;
    }
}
