package day15_ForLoop;

public class ForLoopPractices {
    public static void main(String[] args) {

       //15 16 17 18....45

        for(int i=15; i<=45; i++ ){ // i: 15,16 17 18 ....45
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Hello");

        //100~50
        for(int i=100; i>=50; i--){
            System.out.print(i+" ");
        }

        System.out.println("-------------------------------");

        // print all the even number 1~55for

        /*for(int i=1; i<=55; i++){

            if(i % 2==0){
                System.out.print(i+" ");
            }
            System.out.println();
            System.out.println("-----------------------");

            //print all the even numbers between 1~55" 2, 4, 6, 8,...54

         */


            for(int i=1; i<=54; i+=2){
                System.out.println(i+"");
            }






    }
}
