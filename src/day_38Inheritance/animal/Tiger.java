package day_38Inheritance.animal;

public class Tiger extends Animal {


    public Tiger( String breed, String size, String color, int age, char gender) {
        super("Tiger", breed, size, color, age, gender);
    }
    @Override
    public void eat(){
        System.out.println(name+"eats deer");
    }
}
/*
3. Tiger
					eat(): eats deer
 */