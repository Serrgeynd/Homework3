package Homework3;

import java.util.Date;

public class Nokia {
    public static void main(String[] args) {
        Phone phone = new Phone(89054577898l, "Nokia", 123);
        phone.number = 89054577898l;
        phone.model = "Nokia";
        phone.weigth = 123;
        phone.receiveCall("Петр");
        phone.receiveCall("Хельга", 89025564824L);
        phone.getNumber(89055467890L);
        Phone.sendMessadge(88001001010L, 88101002020L, 88209009090L);
        Phone phone1 = new Phone(89054577899L, "Nokia3", 723);
        Phone phone2 = new Phone("Nokia2", 89064577898L);
        Phone phone3 = new Phone();
        Phone phone4 = new Phone("LG", 89061111111L);
        System.out.println("Номер:  " + phone.number);
        System.out.println("Модель:  " + phone.model);
        System.out.println("Вес:  " + phone.weigth + " гр");
        System.out.println(phone1.number + phone1.model + phone1.weigth);
        System.out.println(phone2.number + phone2.model);
        System.out.println(phone4.number + phone4.model + phone4.weigth);


    }


}

