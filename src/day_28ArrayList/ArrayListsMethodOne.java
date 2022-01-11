package day_28ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListsMethodOne {
    public static void main(String[] args) {

        ArrayList<Integer> numbers= new ArrayList<>();

        numbers.add(10); // 0 // add Data method : adds the data after the last index of ArrayList
        numbers.add(20);// 1
        numbers.add(30);// 2 // original element will shift to 3
        numbers.add(40);// 3
        numbers.add(50);// 4
        numbers.add(60); // 5 it will become 7 after adding 45



        numbers.add(2,25); //2  inserting     // add (index : Data)method inserts the data at the given index
        numbers.add(5,45); //5
        System.out.println(numbers);


        System.out.println(numbers.size()); // how many elements we have in the arrayList, returns you total number elements
        int lastIndex=numbers.size()-1;
        System.out.println("lastIndex = " + lastIndex);
        
        int num=numbers.get(3);// get method gets the element at given index
        System.out.println("num = " + num);

        System.out.println("-----------------------");

        for (int i = 0; i <numbers.size()-1 ; i++) {
            System.out.println( numbers.get(i));

        }
        System.out.println("--------------");

        ArrayList<String>list=new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        list.set(2, "Javascript");//similiar to replace . replaces the element at given index with the new element
        list.set(3, "C++");
        System.out.println(list);

        System.out.println("-----------------------");


        ArrayList<String> employees=new ArrayList<>();

        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Hulya");
        employees.add("Kaloyan");

        System.out.println(employees);
// remove() (int index)- removes the element at index
        employees.remove(0); // remove method one element at the time and decrease the element
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);
        employees.remove(0);
        System.out.println(employees);
        employees.remove(1);
        System.out.println(employees);
        employees.remove( employees.size()-1);
        System.out.println(employees);

        // remove(Object)-removes the given object from array list
        boolean r=employees.remove("Hulya");
        System.out.println(employees);
        boolean r1=employees.remove("Neira");
        System.out.println(employees);

        System.out.println("r = " + r);
        System.out.println("r1 = " + r1);




    }
}
