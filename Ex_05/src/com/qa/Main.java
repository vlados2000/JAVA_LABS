package com.qa;
import  com.qa.model.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Cat c1 = new Cat("Whiskers", 5);
        Cat c2 = new Cat("Bazilio", 3);
        Cat c3 = new Cat("Vasilii", 8);

        Dog d1 = new Dog("Boris", 2);
        Dog d2 = new Dog("Catalin", 27);

        Rabbit r1 = new Rabbit("Peter", 1);
        Rabbit r2 = new Rabbit("Cottontail", 2);
        Rabbit r3 = new Rabbit("Vladimir", 3);


        ArrayList<Animal> myBoys = new ArrayList<>();
        myBoys.add(c1);
        myBoys.add(c2);
        myBoys.add(c3);

        myBoys.add(d1);
        myBoys.add(d2);

        myBoys.add(r1);
        myBoys.add(r2);
        myBoys.add(r3);


        for (Animal myBoy : myBoys) {
            System.out.println(myBoy);
        }

        System.out.println("Printing hashmap ...");

        // Task 3

        HashMap<String, Animal> animalMap = new HashMap<>();
        animalMap.put(c1.getName(), c1);
        animalMap.put(c2.getName(), c2);
        animalMap.put(c3.getName(), c3);

        animalMap.put(d1.getName(), d1);
        animalMap.put(d2.getName(), d2);

        animalMap.put(r1.getName(), r1);
        animalMap.put(r2.getName(), r2);
        animalMap.put(r3.getName(), r3);

        for (String key : animalMap.keySet()) {
            System.out.println("Key: " + key + " Value: " +
                    animalMap.get(key));
        }


        HashMap<Animal, String> animalMap2 = new HashMap<>();
        animalMap2.put(c1, c1.getName() + " is so nice");
        animalMap2.put(c2, c2.getName() + " is eating like me");
        animalMap2.put(c3, c3.getName() + " looks like a lion");
        animalMap2.put(d1, d1.getName() + " best friend");

        System.out.println("Printing hashmap2 ...");
        for (Animal key : animalMap2.keySet()) {
            System.out.println("Animal:  " + key + " .. and all you should know about him is that " +
                    animalMap2.get(key));
        }

        // Task 4


    }
}
