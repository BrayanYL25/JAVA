package pe.isil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> People = new ArrayList<Person>();

        People.add(new Person("Brayan", 18));
        People.add(new Person("Jorge", 19));
        People.add(new Person("Maryse", 19));
        People.add(new Person("Sergio", 20));

        
        Collections.sort(People, new Comparator<Person>() {
           @Override
           public int compare(Person p1, Person p2) {
            return p2.getAge() - p1.getAge();
           } 
        });

        People.forEach((person) -> {
            System.out.println(person.toString());
        });

    }
}