package day_39Recap.Animal;

public class Cat extends FriendlyAnimal{


    public Cat(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    public void scratch(){
        System.out.println(getName()+" is scratching ");
    }

    public void meow(){
        System.out.println(getName()+" is meowing ");
    }
    @Override
    public void eat() {
        System.out.println(getName()+" is eating ");
    }

}
/*
2. Cat:
					Extra methods:
						scratch()
						meow()
 */