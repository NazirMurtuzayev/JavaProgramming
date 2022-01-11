package day_28ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            list.set(i,  list.get(i)*2);// i is index number   ; get method gets element specific index

        }

        System.out.println(list);


    }
}
/*
{1,2,3,4,5,6}
multiply by two

{2,4,6,8,10,12}
 */