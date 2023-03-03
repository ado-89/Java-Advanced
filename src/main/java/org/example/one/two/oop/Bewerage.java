package org.example.one.two.oop;

public abstract class Bewerage implements Drinkable {

    public final String name;
    public Bewerage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double cost();

    public void print(){
        System.out.println(getName() + " kosta: " + cost());
    }

}
