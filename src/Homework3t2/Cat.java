package Homework3t2;

import java.util.Date;


public class Cat extends Animal {
    public String scratc;

    public Cat(String food, String location, String scratc) {
        super(food, location);
        this.scratc = scratc;
    }


    @Override
    public void makeNoise() {
        System.out.println("говорит Мяу");
    }

    @Override
    public void eat() {
        System.out.println("Ест мясо");
    }

    @Override
    public void sleep() {
        System.out.println("Кошка спит");
    }
}



