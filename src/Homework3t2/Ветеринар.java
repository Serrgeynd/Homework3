package Homework3t2;

public class Ветеринар {
        public static void main(String[] args) {
        Animal dog = new Dog();
        dog.food = "Meat";
        dog.location = "Doghouse";
        Animal cat = new Cat();
        cat.food = "Meat";
        cat.location = "Flat22";
        Animal horse = new Horse();
        horse.food = "сено";
        horse.location = "stale";

        String[] Animal = {"Cat", "Dog", "Horce"};
        {
            for (int i = 0; i < 3; i++) System.out.println(Animal[i]);

            System.out.println(dog.food+dog.location+cat.food+cat.location+horse.food+horse.location);
        }

    }
}

