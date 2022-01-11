package officehours;

public class UnitAsssment {
    public static void main(String[] args) {
        int number=5;

        while(number<100){
            number+=number; // number=number+number;// number=20+20=40  40+40=80, 80+80
        }
        System.out.println(number);


        System.out.println("------------");

        int a=0;

        do{
            a=a++ + --a - (a%3); // a=0+0-0 , at the end 3+3-0=6
        }while (++a <4);
        System.out.println(a);// at the end 7
    }
}
