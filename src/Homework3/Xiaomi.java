package Homework3;

public class Xiaomi {
    public static void main(String[] args) {
        Phone phone = new Phone(89264577898l, "Xiaomi", 123);
        phone.number = 89264577898l;
        phone.model = "Xiaomi";
        phone.weigth = 123;
        phone.receiveCall("Коля");
        phone.getNumber(89055467890l);
        Phone phone1 = new Phone(890645778981L, "Xiaomi",659);
        Phone phone2 = new Phone(89053659920L,"Xiaomi");
        Phone phone3 = new Phone();
        Phone phone4 = new Phone("LG", 89061111111L);
        System.out.println("Номер:  " + phone.number);
        System.out.println("Модель:  " + phone.model);
        System.out.println("Вес:  " + phone.weigth + " гр");
        System.out.println(phone.number + phone.model + phone.weigth);
        System.out.println(phone1.number + phone1.model);
        System.out.println(phone4.number + phone4.model + phone4.weigth);
    }
}

