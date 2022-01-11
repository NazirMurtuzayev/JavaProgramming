package day_33Statics.StaticInstanceTasks;

public class Dog {

    public String breed,size,color;
    public char gender;
    public int age;

    public static int numberOfLegs;
    public static int numberOfEyes;
    public static int numberOfWings;
    public static boolean isFriendly;

    public Dog(String breed, String size, String color, char gender, int age) {
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.gender = gender;
        this.age = age;
    }

    static {
        numberOfLegs=4;
        numberOfEyes=2;
        numberOfWings=0;
        isFriendly=false;

    }


    public void eat(){
        System.out.println(breed+" is eating");
    }

    public void sleep() {
        System.out.println(breed + " is sleeping");
    }
    public void play() {
        System.out.println(breed + " is playing");
    }



}
/*
6. Dog Task:
		1. Create a class called Dog
	            Attributes:
	            	instance: breed, size, gender, age, color
	            	statics: numberOfLegs, numberOfEyes, numberOfWings, isFriendly

	            Add a constructor to initialized all the fields
	            (instances)

	            Methods:
	            	eat()
	            	sleep()
	            	play()
	                toString()
 */
