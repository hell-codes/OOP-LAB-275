class A {
    public int a = 1;
    protected int b = 2;
    int c = 3;
    private int d = 4;

    void show() {
        System.out.println(d);
    }
}
public class Types {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.a);
    }
}
