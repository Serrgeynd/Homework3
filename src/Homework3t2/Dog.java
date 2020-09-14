package Homework3t2;

public class Dog extends Animal{
    @Override
    public  void makeNoise() {
        System.out.println("Гав");
    }

    @Override
    public void eat(String food){
        System.out.println("Ест мясо");
    }
    public  static void main (String[]args){
        String molt;
        Animal animal = new Dog();
        animal.makeNoise();
        animal.food = "Meat";
        animal.location = "doghouse";
        molt = "Линяет";
        animal.eat("Мясо");
        animal.sleep("собака");
        System.out.println("Еда:  "+animal.food + ",  Живет:  " + animal.location + ", Примечание:  " +molt );

    }
}
