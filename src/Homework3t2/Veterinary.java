package Homework3t2;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class Veterinary {

    Animal animal = new Animal("", "");


    public void treatAnimal(Animal animal) {
        System.out.println("Ест:  " + animal.food + "  Живет:  " + animal.location);


    }
}




