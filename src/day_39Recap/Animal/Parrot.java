package day_39Recap.Animal;

public class Parrot extends FriendlyAnimal {


    public Parrot(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    public void fly(){
        System.out.println(getName()+" is flying ");
    }
    public void sing(){
        System.out.println(getName()+" is singing ");
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating ");
    }
}
/*
4. Parrot:
					Extra methods:
						fly()
						sing()
 */