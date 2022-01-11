package day09;

public class MaximumNumber {

    public static void main(String[] args) {

      int n1= 50;
      int n2 = 100;

      boolean n1IsMax= n1>n2;
      boolean n2IsMin= n2>n1;
      boolean n3isEqual = n1==n2;

      if(n1>n2){
          System.out.println(n1+" is the maximum number");

      } else if(n2>n1){
          System.out.println(n2+" is the maximum number");

      }else{
          System.out.println(n1==n2);
        }



    }

}
/*
1. Maximum number between two different numbers
 */
