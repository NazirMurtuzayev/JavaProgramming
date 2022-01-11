package day_34GarbageCollection_AcessModifiers;

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("Main Method");
    }

    static {
        System.out.println("Static Block1");  // Static Block is first to run and only runs one time

    }
    static {

        System.out.println("Static Block2");
    }
    static {
        System.out.println("Static Block3");
    }





}
