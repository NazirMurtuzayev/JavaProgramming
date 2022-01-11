package day04variables;

public class Circle {


    public static void main(String[] args) {

        // PI,radius,diameter, area,Perimeter

        double PI= 3.14;
        double radius= 10;
        double diameter=radius* 2; // it finds a diameter by multiplying the radius by 2
        double area= radius*radius*PI; // finds the area of the circle
        double perimeter= diameter*PI; // finds the perimeter of the circle

        System.out.println("radius = " + radius);
        System.out.println("diameter = " + diameter);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);


    }
}


/*
3. Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle PI ,radius,diameter, area,perimeter.
                    Hints:  PI = 3.14
                            area = radius * radius * PI
                            Perimeter = 2 * radius * PI
 */