package Homework3;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone(89054577898l, "Nokia", 123);
        phone.number = 89054577898l;
        phone.model = "Nokia";
        phone.weigth = 123;
        phone.receiveCall("Петр");
        phone.receiveCall("Хельга", 89025564824L);
        phone.getNumber(89055467890L);
        Phone.sendMessadge(88001001010L, 88101002020L, 88209009090L);
        System.out.println(phone.number + phone.model + phone.weigth);

    }

    {
        Phone phone1 = new Phone(89054577898l, "Nokia", 123);
        phone1.number = 89054577898l;
        phone1.model = "Nokia";
        phone1.weigth = 123;
        phone1.receiveCall("Петр");
        phone1.receiveCall("Хельга", 89025564824L);
        phone1.getNumber(89055467890L);
        Phone.sendMessadge(88001001010L, 88101002020L, 88209009090L);
        System.out.println(phone1.number + phone1.model + phone1.weigth);
    }

    {
        Phone phone2 = new Phone(89054577898l, "Nokia", 123);
        phone2.number = 89054577898l;
        phone2.model = "Nokia";
        phone2.weigth = 123;
        phone2.receiveCall("Петр");
        phone2.receiveCall("Хельга", 89025564824L);
        phone2.getNumber(89055467890L);
        Phone.sendMessadge(88001001010L, 88101002020L, 88209009090L);
        System.out.println(phone2.number + phone2.model + phone2.weigth);
    }
}
