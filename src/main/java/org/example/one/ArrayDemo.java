package org.example.one;

public class ArrayDemo {
    public static void main(String[] args) {

        int[] numbers = new int[3];
        numbers[0] = 223;
        numbers[1] = 2442;
        numbers[2] = 11;
        for (int i=0; i<numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }
        for (int number : numbers) {
            System.out.println(number);
        }
        // numbers[3] = 5;
        System.out.println("DINAMICKI NIZ");
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(332);
        dynamicArray.add(1221);
        dynamicArray.add(1);
        dynamicArray.add(921);
        for (int number : dynamicArray) {
            System.out.println(number);
        }


    }
}
