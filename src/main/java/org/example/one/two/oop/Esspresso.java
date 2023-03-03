package org.example.one.two.oop;

public class Esspresso extends Bewerage{
    public Esspresso() {
        super("Esspresso");
    }

    @Override
    public double cost() {
        return 2.0;
    }

    @Override
    public void drink() {
        System.out.println("Pijem esspresso ...");

    }
}
