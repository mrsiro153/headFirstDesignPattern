package siro.revision.template;

public class TeaBeverage extends BeverageSequence {

    @Override
    void addToping() {
        System.out.println("This is tea, add tea toping");
    }

    @Override
    void packageToGlass() {
        System.out.println("This is tea, package to PAPER glass");
    }

}
