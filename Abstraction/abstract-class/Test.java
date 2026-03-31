
abstract class Animal {
    abstract void sound();

    void sleep() {
        System.out.println("Animal sleeps");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        d.sleep();
    }
}
