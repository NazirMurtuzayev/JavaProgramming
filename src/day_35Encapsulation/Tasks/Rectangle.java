package day_35Encapsulation.Tasks;

public class Rectangle {

    private double with;
    private double length;

    public Rectangle(double with, double length) {
        setWith(with);
        setLength(length);
    }

    public double getWith() {
        return with;
    }

    public void setWith(double with) {
        if(with<0) {
            System.err.println("Invalid with");
            return;
        }
        this.with = with;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length<0){
            System.err.println("Invalid length");
            return;
        }

        this.length = length;
    }

    public double calcArea(){
        return with*length;
    }

    public double calcPerimeter(){
         return 2*(length + with);
    }

    public String toString() {
        return "Rectangle{" +
                " with=" + with +
                ", length=" + length +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +

                '}';
    }
}
/*
2. Rectangle Task:
         Create a class named Rectangle:
        Private variables:
        width, length

        Encapsulate all the fields
        Conditions:
        width of the rectangle should not be negative
        length of the rectangle should not be negative

        Add a constructor that allows user to set all the fields when the object is created.
        (If the arguments not valid it should not be set to the instances)

        Methods:
        calcArea(): returns the area of rectangle
        calcPerimeter(): returns the perimeter of rectangle
        toString(): can display the width, length, area, and perimeter of rectangle when object is passed in print statement

 */
