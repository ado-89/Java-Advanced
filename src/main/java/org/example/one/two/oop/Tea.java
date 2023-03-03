package org.example.one.two.oop;

public class Tea extends Bewerage{

    public Tea() {
        super("Forest fruit tea");
    }

    @Override
    public double cost() {
        return 2;
    }

    @Override
    public void drink() {
        System.out.println("Pije se caj...");
    }
}
