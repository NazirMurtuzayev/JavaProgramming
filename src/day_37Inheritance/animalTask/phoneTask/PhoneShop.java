package day_37Inheritance.animalTask.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone iphone=new Iphone ("Ipone12","6.7 inches",1000,"Black");
        Samsung samsung=new Samsung ("galaxy s19","6 inches",900,"white");
        Nokia nokia =new Nokia ("Brick","4 inches",50,"Gray");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.text(123456789);
        iphone.faceTime(78945613);
        iphone.faceTime("yahoo@gmail.com");

        System.out.println("---------------------");

        samsung.call(911);
        samsung.text(123456789);
        samsung.freeze();

        System.out.println("----------------------");
        System.out.println(Phone.hasBattery);
        System.out.println(Iphone.hasBattery);
        System.out.println(Samsung.hasBattery);
        System.out.println(Nokia.hasBattery);


    }

}

