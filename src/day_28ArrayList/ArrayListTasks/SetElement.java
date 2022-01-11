package day_28ArrayList.ArrayListTasks;

import java.util.ArrayList;

public class SetElement {
    public static void main(String[] args) {

        ArrayList<Integer> elements=new ArrayList<>();

       elements.add(1);
       elements.add(2);
       elements.add(3);
       elements.add(4);
       elements.add(5);

       elements.set(elements.size()-1,0); // changing last element with 0 ,
        System.out.println(elements);

        // elements.size()-1 ( index to set), 0 is  new value



    }
}
/*
1. write a program that can set the last element
of the Integer arraylist to zero
	            ex:
	                list = [1,2,3,4,5];
	                output: [1,2,3,4,0];
 */
