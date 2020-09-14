package Homework3t2;

import java.util.Date;


public class Cat extends Animal {

    @Override
    public void makeNoise() {
        System.out.println("Мяу");
    }

    @Override
    public void eat(String food){
        System.out.println("Ест мясо");
    }




    public static void main(String[] args) {
        String scratc;
        Animal cat = new Cat();
        cat.makeNoise();
        cat.food = "Meat";
        cat.location = "Flat22";
        scratc = "Царапается";
        cat.eat("Мясо");
        cat.sleep("кошка");
        System.out.println("Еда:  " + cat.food + ",  Живет:  " + cat.location + ", Примечание:  " + scratc);

    }
}
