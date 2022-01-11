package day_23CustomMethod.CustomMethodTasks;

public class EvenNumbers {

    public static void main(String[] args) {

        printEvenNumbers();

    }





    public static void printEvenNumbers(){

        for (int i = 0; i <100 ; i++) {
            if(i%2==0){
                System.out.print(i+" ");
            }

        }
        System.out.println();
    }
}
/*
2. create a method that can print even numbers between 1~100 in a same line saperated by space
 */