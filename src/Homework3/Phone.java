package Homework3;

import java.util.Arrays;

import static jdk.nashorn.internal.objects.Global.println;

public class Phone {
    Long number;
    String model;
    int weigth;


    public Phone(Long number, String model, int weigth) {
        this.number = number;
        this.model = model;
        this.weigth = weigth;
    }

    public Phone(Long number, String model) {
        this(number, model, -1);

    }

    public Phone() {
    }

    public Phone(String model, Long number) {
        this.model = model;
        this.number = number;
    }


    public void receiveCall(String name) {

        System.out.println("Звонит:" + name);
    }

    public void receiveCall(String name, Long receivenumber) {
        System.out.println("Звонит:" + name + "  " + receivenumber);

    }


    public Long getNumber(Long receivenumber) {
        System.out.println(receivenumber);
        return receivenumber;
    }

    public static Long sendMessadge(Long... numbers) {
        System.out.println("Список номеров для рассылки " + Arrays.toString(numbers));
        return null;
    }


}















