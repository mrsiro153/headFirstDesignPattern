package siro.revision.strategy;

import siro.revision.strategy.concreteDuck.DuckFake;
import siro.revision.strategy.concreteDuck.DuckNormal;
import siro.revision.strategy.concreteDuck.DuckSpecial;

public class MainClass {
    public static void main(String[] args) {
        DuckNormal normal = new DuckNormal();
        DuckSpecial special = new DuckSpecial();
        DuckFake fake = new DuckFake();
        //
        normal.performQuack();
        special.performQuack();
        fake.performQuack();
    }
}
