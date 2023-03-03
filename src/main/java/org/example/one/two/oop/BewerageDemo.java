package org.example.one.two.oop;

public class BewerageDemo {
    public static void main(String[] args) {
        Esspresso esspresso = new Esspresso();
        // FileReader filereader = new FileReader
        MilkDecorator milkDecorator = new MilkDecorator(esspresso);
        milkDecorator.drink();
        milkDecorator.print();
        esspresso.drink();
        esspresso.print();


        Tea tea = new Tea();
        tea.drink();
        tea.print();
    }
}
