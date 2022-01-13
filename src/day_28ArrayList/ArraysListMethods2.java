package day_28ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysListMethods2 {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);
        //int num=1;
        //list.remove(num);


        Integer num=200;
       boolean r= list.remove(num); // removes the object
        System.out.println(list);
        System.out.println(r);

        System.out.println("----------");

        System.out.println(list.size());


    //  clear() remove all the elements of the arraylist , size will be 0
        list.clear();
        System.out.println(list.size());
        System.out.println(list);

        System.out.println("------------------------------");

        ArrayList<Character> characters=new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a=characters.indexOf('A');// returns first matching element's index number
        int b =characters.lastIndexOf('A'); // returns the last matching element's index number

        System.out.println(a);
        System.out.println(b);

        System.out.println("----------------");

        boolean r2=characters.contains('A');

        boolean r3=characters.contains('Z');

        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println("--------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1 == list2);
        System.out.println(list1.equals(list2));

        System.out.println("--------------------------------");
         list.clear();
        boolean r4 = list.isEmpty(); // false

        System.out.println("r4 = " + r4);

        System.out.println("----------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();
        //Bulk Operation: CollectionType
        numbers.addAll( Arrays.asList(1,2,3,4,5,6,7) );

        System.out.println(numbers);











    }
}
