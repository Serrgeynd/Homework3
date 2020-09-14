package Homework3;

public class Htc {
    public static void main( String[]args){
        Phone phone = new Phone(89164577898l,"HTC",523);
        phone.number = 89164577898l;
        phone.model = "HTC";
        phone.weigth = 523;
        phone.receiveCall("Вася");
        phone.receiveCall("Элен",89025564824L);
        phone.getNumber(89055467890l);
        Phone.sendMessadge(88001001010L,88101002020L,88209009090L);
        Phone phone1 = new Phone("Nokia2",89064577898l);
        Phone phone2 = new Phone();
        Phone phone3 = new Phone();
        Phone phone4 = new Phone("LG",89061111111L);
        System.out.println("Номер:  "+phone.number);
        System.out.println("Модель:  "+phone.model);
        System.out.println("Вес:  "+ phone.weigth+" гр");
        System.out.println(phone.number+phone.model+phone.weigth);
        System.out.println(phone1.number+phone1.model);
        System.out.println(phone4.number+phone4.model+phone4.weigth);
    }
}
