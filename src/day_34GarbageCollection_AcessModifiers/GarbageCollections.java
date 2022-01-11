package day_34GarbageCollection_AcessModifiers;

import java.util.ArrayList;
import java.util.Arrays;

import day_30CustomClass.Dog;
import day_31Constructor.Student;
import day_32Constructors.Car;

public class GarbageCollections {
    public static void main(String[] args) {
        /*
        int n=null;
        String str=null; // null is not an object, that means object does not exist            "" empty string is object

        System.out.println(str.toUpperCase());

         */

        String str="Wooden Spoon";// is not eligible for garbage collection
        str=null;
        System.out.println(str);//after line 13 "Wooden Spoon" will be eligible for Garbage Collection because we assgined to null line 13


      Car car1=new Car("Toyota"); // now eligible for garbage collection, garbage collector will collect by calling finalize method
      //car1 = null;
        System.out.println(car1);

        System.out.println("---------------");

        Dog dog1=new Dog();
        dog1.name="Lucy";

        dog1=new Dog();
        dog1.name="Max";

        System.out.println(dog1);


        System.out.println("-------------");
        String language="Python"; // after line 40 it is eligible for garbage collections
        language="Java";
        System.out.println(language);

        System.out.println("--------------------");

        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(100);
        ArrayList<Integer> list2=list1;

        list2.addAll(Arrays.asList(200,300,400));

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1==list2);

        System.out.println("-----------------------");


        Student student1=new Student("Tahir",30,'M','B',14);
       student1.grade='A';
         Student student2=student1;
        System.out.println(student1);
        System.out.println(student2);

        System.out.println("------------------");

        ArrayList<String > l1=new ArrayList<>();
        l1.add("Java");

        ArrayList<String > l2=new ArrayList<>();
        l2.add("Python");


        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);

        // garbage collection for non primitive types and it defines Colections of unreferenced objects
        // garbage collector is responsible for collecting the unreferenced objects from java heap. and destroys it(finalize()) method





    }
}
