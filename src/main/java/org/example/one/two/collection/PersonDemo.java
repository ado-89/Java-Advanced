package org.example.one.two.collection;

import java.util.List;

public class PersonDemo {
    public static void main(String[] args) {
        PersonCsvReader personCsvReader = new PersonCsvReader("persons.csv");
        List<Person> personList = personCsvReader.readPersonList();
        for (int i=0; i<personList.size(); i++) {
            Person person = personList.get(i);
            System.out.println(person);
            System.out.println();

        }

        System.out.println("Napredniji nacin - java 7");
        for (Person person : personList) {
            System.out.println(person);
        }

        System.out.println();
        System.out.println("ENHANCED NACIN...");
        personList.forEach(System.out::println);
    }
}
