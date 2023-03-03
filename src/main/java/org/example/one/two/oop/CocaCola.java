package org.example.one.two.oop;

public class CocaCola extends Bewerage{
    public CocaCola() {
        super("Coca Cola");
    }

    @Override
    public double cost() {
        return 3.5;
    }

    @Override
    public void drink() {
        System.out.println("Pije se coca cola...");

    }
}
