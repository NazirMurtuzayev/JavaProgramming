package officehours.practice_jan19;

public class StaticEx {
    static void method1(){
        System.out.print(3);
    }

    public static void main(String[] args) {
        System.out.print(5);

    }

    static {// static block always runs first
        System.out.print(7);
    }
}
