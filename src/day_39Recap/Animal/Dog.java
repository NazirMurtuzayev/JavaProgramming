package day_39Recap.Animal;

public class Dog extends FriendlyAnimal{


    public Dog(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    public void bark(){
        System.out.println(getName()+" is barking ");
    }
    @Override
    public void eat() {
        System.out.println(getName()+" is eating ");
    }

}
/*
1. Dog:
					Extra methods:
						bark()
 */