package Packages;

public class Hello {

    public void display() {
        System.out.println("Hello from mypack package!");
    }

    public static void main(String[] args) {
        Hello obj = new Hello();
        obj.display();
    }
}
