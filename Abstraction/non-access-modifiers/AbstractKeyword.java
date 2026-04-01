abstract class Demo {
    abstract void display();
}

class Test extends Demo {
    void display() {
        System.out.println("Implemented method");
    }
}

public class AbstractKeyword {
    public static void main(String[] args) {
        Test t = new Test();
        t.display();
    }
}
