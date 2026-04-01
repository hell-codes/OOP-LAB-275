class Test {
    private int data = 100;

    public int getData() {
        return data;
    }
}
public class Private {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.getData());
    }
}
