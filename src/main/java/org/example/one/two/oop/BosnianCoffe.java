package org.example.one.two.oop;

public class BosnianCoffe extends Bewerage{

    public BosnianCoffe() {
        super("Bosnian Caffe");
    }

    @Override
    public double cost() {
        return 2.5;
    }

    @Override
    public void drink() {
        System.out.println("Ah meraka uz kahvu tursku...");

    }
}
