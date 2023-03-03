package org.example.one.collection;

import java.util.List;
import java.util.Scanner;

public class ForLoopsTest {
    public static void main(String[] args) {
        int [] numbers = new int[3];
        numbers[0] = 12;
        numbers[1] = 33;
        numbers[2] = 44;

        //indexi:       0,  1,  2
        //vrijednosti:  12, 33, 44
        for (int i = 0; i< numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }

        for(int number : numbers)
        {
            System.out.println(number);
        }

        Person [] persons = new Person[3];
        persons[0] = new Person("Admir", "Rizvanovic");
        persons[1] = new Person("Ajet", "Rizvanovic");
        persons[2] = new Person("Ado", "Rizvanovic");

        for (int i = 0; i < 2; i++)
        {
            System.out.println("FirstName: " + persons[i].FirstName + ", LastName: " + persons[i].LastName);
        }

        System.out.println("*******************");
        int i = 0;
        for (Person person : persons)
        {
            if(i > 2)
                break;

            System.out.println("FirstName: " + person.FirstName + ", LastName: " + person.LastName);
            i++;
        }


        char[] sourceArray = {'d', 65 , 'c', 'a', 'f', 'f', 'e','t', 'i', 'n', 'r','z'};
        char[] destinationArray = new char[8];
        System.arraycopy(sourceArray, 2, destinationArray, 0, 8);
        System.out.println(destinationArray);



        String recenica = "Uskoro cete dobiti zadatak da provjerite dali je unesena rijec palindrom";
        char[] nizSlovaRecenice = recenica.toCharArray();
        System.out.println("Unesite samo jednu rijec");
        String rijec = new Scanner(System.in).nextLine();
        char[] nizSlovaRijeci = rijec.toCharArray();

    }



}

class  Person
{
    public Person(String firstName, String lastName)
    {
        FirstName = firstName;
        LastName = lastName;
    }

    public  String FirstName;
    public  String LastName;

}
