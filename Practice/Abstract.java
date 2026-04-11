package Practice;

abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    void area() {
        double r = 5;
        System.out.println("Circle Area: " + (3.14 * r * r));
    }
}

class Rectangle extends Shape {
    void area() {
        int l = 4, b = 6;
        System.out.println("Rectangle Area: " + (l * b));
    }
}

public class Abstract {
    public static void main(String[] args) {
        Shape s;

        s = new Circle();
        s.area();

        s = new Rectangle();
        s.area();
    }
}
