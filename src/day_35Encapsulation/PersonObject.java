package day_35Encapsulation;

public class PersonObject {
    public static void main(String[] args) {


       Person person1=new Person("Ramel",30,'M',"English");
       Person person2=new Person("Ram",32,'M',"Hebrew");

       System.out.println(person1);
        System.out.println(person2);
        System.out.println(person1.numberOfHead);

    }
}
