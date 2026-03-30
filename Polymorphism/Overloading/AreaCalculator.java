package Overloading;

public class AreaCalculator {

    double area(double side) {
        return side * side;
    }

    double area(double length, double breadth) {
        return length * breadth;
    }

    double area(float radius) {
        return 3.14 * radius * radius;
    }
    public static void main(String[] args) {
        AreaCalculator obj = new AreaCalculator();

        System.out.println("Square: " + obj.area(5));
        System.out.println("Rectangle: " + obj.area(5, 10));
        System.out.println("Circle: " + obj.area(3.0f));
    }
}
