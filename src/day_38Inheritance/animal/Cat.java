package day_38Inheritance.animal;

public class Cat extends Animal {

    public Cat(String breed, String size, String color, int age, char gender) {
        super("Cat", breed, size, color, age, gender);
    }

    @Override
    public void eat(){
        System.out.println(name+"eats cat food");

    }
}
/*
1. Cat
					eat(): eats cat food
 */