package day_33Statics.StaticInstanceTasks;

public class DogObject {
    public static void main(String[] args) {


        Dog dog=new Dog("Husky","small","white",'F',4);

        System.out.println(dog);
        dog.eat();
        dog.sleep();
        dog.play();

        System.out.println(Dog.isFriendly);
    }
}
