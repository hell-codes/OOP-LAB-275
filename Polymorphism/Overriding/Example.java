package Overriding;

class Parent {
    void view() {
        System.out.println("This is a parent class method");
    }
}

class Child extends Parent {
    void view() {
        System.out.println("This is a child class method");
    }
}

public class Example {
    public static void main(String args[]) {
        Parent ob = new Parent();
        ob.view();

        Child ob1 = new Child();
        ob1.view();
    }
}
