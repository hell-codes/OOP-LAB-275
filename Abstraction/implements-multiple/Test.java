interface Shape {
    void draw();
}

class Cricle implements Shape {
    public void draw() {
        System.out.println("Drawing Cricle");
    }
}

public class Test {
    public static void main(String[] args) {
        Shape s = new Cricle();
        s.draw();
    }
}
