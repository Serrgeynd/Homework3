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

    public static void main(String[] args) {

        Phone phone = new Phone(89164577898l, "HTC", 523);
        phone.number = 89164577898l;
        phone.model = "HTC";
        phone.weigth = 523;
        phone.receiveCall("Вася");
        phone.receiveCall("Элен", 89025564824L);
        phone.getNumber(89055467890l);
        Phone.sendMessadge(88001001010L, 88101002020L, 88209009090L);
        Phone phone1 = new Phone("Nokia2", 89064577898l);
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();
        Phone phone4 = new Phone("LG", 89061111111L);
        System.out.println("Номер:  " + phone.number);
        System.out.println("Модель:  " + phone.model);
        System.out.println("Вес:  " + phone.weigth + " гр");
        System.out.println(phone.number + phone.model + phone.weigth);
        System.out.println(phone1.number + phone1.model);
        System.out.println(phone4.number+phone4.model);


    }
}














