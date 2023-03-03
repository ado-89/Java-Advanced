package org.example.one.collection;

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("Ajet");
        nameList.add("Hamida");
        nameList.add("Admir");
        nameList.add("Admir");
        nameList.add("Azemina");
        nameList.add("Davud");
        nameList.add("Asija");
        nameList.add("Halid");
        for (int i=0; i<nameList.size(); i++) {
            String name = nameList.get(i);
            System.out.println(name);
        }

        Set<String> setOfNames = new HashSet<>();
        setOfNames.add("Ajet");
        setOfNames.add("Hamida");
        setOfNames.add("Admir");
        setOfNames.add("Admir");
        setOfNames.add("Azemina");
        setOfNames.add("Davud");
        setOfNames.add("Asija");
        setOfNames.add("Halid");
        System.out.println("SETOVI ...");
        for (String name : setOfNames) {
            System.out.println(name);
        }


    }
}