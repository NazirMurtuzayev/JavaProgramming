package day_38Inheritance.animal;

public class Dog extends Animal{


    public Dog( String breed, String size, String color, int age, char gender) {
        super("Dog", breed, size, color, age, gender);
    }

    @Override
    public void eat(){

        System.out.println(name+"eats dog food");
    }

}
/*
2. Dog

        eat(): eats dog food

 */
