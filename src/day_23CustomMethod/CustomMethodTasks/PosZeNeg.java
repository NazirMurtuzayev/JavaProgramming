package day_23CustomMethod.CustomMethodTasks;

public class PosZeNeg {
    public static void main(String[] args) {
        integer(-2);
    }


    public static void integer (int number){

        String result="";

        if(number>0){
            result="Positive";
        }else if(number==0){
            result="Zero";
        }else{
            result="Negative";
        }
        System.out.println(result);
    }

}
/*
12. create a method that can if the given integer is positive,
negative or zero
 */
