class Parent {
    protected int x = 10;
}
class Child extends Parent {
    void display() {
        System.out.println(x);
    }
}
public class Protected {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
