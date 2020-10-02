package Homework3t2;

public class Dog extends Animal {
    public String molt;

    public Dog(String food, String location, String molt) {
        super(food, location);
        this.molt = molt;

    }


    @Override
    public void makeNoise() {
        System.out.println("Гав");
    }

    @Override
    public void eat() {
        System.out.println("Ест мясо");
    }


}