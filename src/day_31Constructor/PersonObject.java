package day_31Constructor;

public class PersonObject {

    public static void main(String[] args) {

        Person person1=new Person("Daniel",'M',32);

        Person person2=new Person("Ksenia",'F',28);

        person2.age=30; // if you want to change the age


        System.out.println(person1);
        System.out.println(person2);


    }

}
