package day_23CustomMethod.CustomMethodTasks;

public class EachElement {
    public static void main(String[] args) {

        int[] array={1,2,3,4,5};
        printEachElement(array);

    }

    public  static void printEachElement(int [] array){

        for (int each:array) {
            System.out.println(each);
        }

    }

}
/*
14. create a method named printEachElement
that can print each element of an integer array
 */
