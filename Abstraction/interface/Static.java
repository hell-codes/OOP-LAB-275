interface Test{
    static void show() {
        System.out.println("Static method");
    }
}
public class Static {
    public static void main(String[] args) {
        Test.show();
    }
}
