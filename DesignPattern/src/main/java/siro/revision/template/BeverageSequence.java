package siro.revision.template;

public abstract class BeverageSequence {
    //
    abstract void addToping();

    abstract void packageToGlass();

    //
    private void boilWater() {
        System.out.println("Boil Water...");
    }

    private void mixCondiments() {
        System.out.println("Mixing all condiments....");
    }

    //
    public final void makingBeverage() {
        boilWater();
        if (allowToping()) addToping();
        mixCondiments();
        packageToGlass();
    }

    //
    protected boolean allowToping() {
        return false;
    }
}
