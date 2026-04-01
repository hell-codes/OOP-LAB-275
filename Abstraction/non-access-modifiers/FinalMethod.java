class A {
    final void show() {
        System.out.println("Final method");
    }
}

class B extends A {
    void display() {
        System.out.println("Child class");
    }
}

public class FinalMethod {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.display();
    }
}
