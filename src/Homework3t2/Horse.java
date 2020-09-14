package Homework3t2;

public class Horse extends Animal{
    @Override
    public  void makeNoise() {
        System.out.println("Игого");
    }

    @Override
    public void eat(String food){
        System.out.println("Ест сено");
    }
    public  static void main (String[]args){
        String molt;
        Animal animal = new Horse();
        animal.makeNoise();
        animal.food = "Meat";
        animal.location = "stale";
        molt = "Линяет";
        animal.eat("Сено");
        animal.sleep("Лошадь");
        System.out.println("Еда:  "+animal.food + ",  Живет:  " + animal.location + ", Примечание:  " +molt );

    }
}