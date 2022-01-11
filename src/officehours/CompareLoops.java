package officehours;

public class CompareLoops {
    public static void main(String[] args) {

        int num=10;
        int count=0;
        for(int i=num;i<5;i++){
            System.out.println("Hello batch-25 For Loop");
       }
        System.out.println("Hello batch-25 While Loop");


        while(num>5){
            System.out.println("Hello batch-25 While Loop");
            count--;
        }

        System.out.println("====================");

        do{
           System.out.println("Hello batch-25 While Loop");
        }while(num<5);

    }
}
