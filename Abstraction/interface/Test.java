
interface Animal {
    void eat();
}
class Cat implements Animal {
    public void eat() {
        System.out.println("Cat eats");
    }

}
public class Test {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
    }
}
