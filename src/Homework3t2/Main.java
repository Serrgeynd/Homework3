package Homework3t2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Veterinary veterinary = new Veterinary();
        Animal[] animal = new Animal[3];
        animal[0] = new Cat("Мясо", "Квартира 22", "Царапается");
        animal[1] = new Dog("Кости", "Конура", "Линяет");
        animal[2] = new Horse("Сено", "Конюшня", "Быстро бегает");
        veterinary.treatAnimal(animal[1]);
    }
}
