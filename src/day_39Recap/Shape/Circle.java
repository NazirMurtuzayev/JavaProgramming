package day_39Recap.Shape;

public class Circle extends Shape {

    private double radius;
    public static double pi;


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {

           if(radius<=0){
               System.err.println("Invalid Radius"+radius);
               System.exit(1);
           }


        this.radius = radius;
    }



    public Circle( double radius) {
        super("Circle");
        setRadius(radius);
    }

    @Override
    public double area() {
        return radius*radius*pi;
    }

    @Override
    public double perimeter() {
        return 2*radius*pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "pi="+pi+
                "area='" + area() + '\'' +
                "perimeter='" + perimeter() + '\'' +
                '}';
    }
}
