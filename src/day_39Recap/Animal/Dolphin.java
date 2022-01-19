package day_39Recap.Animal;

public class Dolphin extends FriendlyAnimal {


    public Dolphin(String name, String breed, String size, String color, char gender, int age) {
        super(name, breed, size, color, gender, age);
    }

    public void swim(){
        System.out.println(getName()+" is swimming ");
    }
    @Override
    public void eat() {
        System.out.println(getName()+" is eating ");
    }


}
/*
3. Dolphin:
					Extra methods:
						swim()
 */