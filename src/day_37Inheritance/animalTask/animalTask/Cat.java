package day_37Inheritance.animalTask.animalTask;

import day_37Inheritance.animalTask.animalTask.Animal;

public class Cat extends Animal {


    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void scratch(){
        System.out.println(name+" is scratching");
    }
}
