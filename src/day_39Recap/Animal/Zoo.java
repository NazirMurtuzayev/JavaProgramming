package day_39Recap.Animal;

import java.util.ArrayList;
import java.util.Arrays;

public class Zoo {
    public static void main(String[] args) {

        Cat cat =new Cat("Vivab","Persian","small","black",'F',2);

        Tiger tiger=new Tiger("Ramo","Sumatran","big","brown",'M',2);

        Dolphin dolphin=new Dolphin("Jacks","Bottlenose","small","grey",'M',3);

        Dog dog=new Dog("Firuz","Caucasian shepard","big","black",'F',3);

        Lion lion=new Lion("Sahsivar","African","big","orange",'M',3);


        System.out.println(cat);
        System.out.println(dog);
        System.out.println(tiger);
        System.out.println(lion);
        System.out.println(dolphin);

        ArrayList<WildAnimal>list=new ArrayList<>();
        list.addAll(Arrays.asList(tiger,lion));
        System.out.println(list);

        dog.getAge();
        System.out.println(dog.getAge());

        dog.eat();

        tiger.hunt();

        System.out.println("dog= "+dog);



    }
}
