final class A {
    void show() {
        System.out.println("Final class");
    }
}
public class FinalClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();
    }
}
