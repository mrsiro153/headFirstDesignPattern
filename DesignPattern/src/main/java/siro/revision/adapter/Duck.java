package siro.revision.adapter;

public class Duck implements IDuck {
    @Override
    public void say() {
        System.out.println("I am a duck and I saying.... ");
    }

    @Override
    public void go() {
        System.out.println("I am a duck and I going...");
    }
}
