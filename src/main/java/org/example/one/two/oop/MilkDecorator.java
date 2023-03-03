package org.example.one.two.oop;

public class MilkDecorator extends Bewerage {

    private Bewerage bewerage;

    public MilkDecorator(Bewerage bewerage) {
        super("s mlijekom");
        this.bewerage = bewerage;
    }

    @Override
    public double cost() {
        return bewerage.cost() + 0.5;
    }

    @Override
    public void drink() {
        System.out.println(bewerage.getName() + " s mlijekom pijem");
    }
}
