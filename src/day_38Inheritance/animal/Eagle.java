package day_38Inheritance.animal;

public class Eagle extends Animal {

    public Eagle( String breed, String size, String color, int age, char gender) {
        super("Eagle", breed, size, color, age, gender);
    }

    @Override
    public void eat(){
        System.out.println(name+"eats snake");
    }
}
/*

			4. Eagle
					eat(): eats snake
 */