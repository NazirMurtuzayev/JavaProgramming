package day_37Inheritance.animalTask.animalTask;

public class AnimalObject {
    public static void main(String[] args) {

        Dog dog=new Dog("Alex","Husky",'M',1,"Small","black");

        System.out.println(dog);

        Cat cat= new Cat("Love","Siamese",'F',2,"Large","black");

        System.out.println(cat);

        Parrot parrot=new Parrot("King","Macaw",'M', 3,"Small", "Blue");
        System.out.println(parrot);


    }


}
