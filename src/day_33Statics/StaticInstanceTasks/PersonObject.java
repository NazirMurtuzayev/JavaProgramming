package day_33Statics.StaticInstanceTasks;

public class PersonObject {
    public static void main(String[] args) {

        Person person=new Person("Nazir",31,'M');

        System.out.println(person);

        System.out.println(Person.numberOfEyes);


    }
}
