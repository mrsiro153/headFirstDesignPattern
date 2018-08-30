package siro.revision.adapter;

public class TestClass {
    public static void main(String[] args) {
        IDuck duck = new Duck();
        ChickenAdapter d = new ChickenAdapter(duck);
        //
        d.talk();
        d.walk();
    }
}
