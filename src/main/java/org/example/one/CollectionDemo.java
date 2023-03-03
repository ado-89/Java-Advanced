package org.example.one;

public class CollectionDemo {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Halid");
        p1.setGender(Gender.MALE);

        Person p2 = new Person();
        p2.setName("Asija");
        p2.setGender(Gender.FEMALE);

        Person p3 = new Person();
        p3.setName("Davud");
        p3.setGender(Gender.FEMALE);

        Box<Integer> kutija1 = new Box<>();
        kutija1.setPolje(20);

        Box<Person> kutija2 = new Box<>();

    }
}
