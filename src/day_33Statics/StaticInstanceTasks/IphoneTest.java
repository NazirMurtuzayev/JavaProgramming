package day_33Statics.StaticInstanceTasks;

public class IphoneTest {
    public static void main(String[] args) {

        Iphone iphone=new Iphone("Ipone11",980,"black","small");

        System.out.println(iphone);
        System.out.println(iphone.madeIn);

        iphone.faceTime("nmurtuzayev@gmail.com");

    }
}
