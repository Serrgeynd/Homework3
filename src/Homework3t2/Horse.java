package Homework3t2;

public class Horse extends Animal {
    public String run;

    public Horse(String food, String location, String run) {
        super(food, location);
        this.run = run;
    }


    @Override
    public void makeNoise() {
        System.out.println("Говорит игого");
    }

    @Override
    public void eat() {
        System.out.println("Ест сено");
    }

    @Override
    public void sleep() {
        System.out.println("Лошадь спит");
    }

}