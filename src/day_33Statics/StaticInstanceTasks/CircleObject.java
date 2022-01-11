package day_33Statics.StaticInstanceTasks;

public class CircleObject {
    public static void main(String[] args) {

        Circle circle=new Circle(1.5);

        System.out.println(Circle.pi);
        System.out.println(circle.calcArea());
        System.out.println(circle.calcPerimeter());

    }
}
