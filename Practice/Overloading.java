package Practice;

public class Overloading {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();

        System.out.println("Sum of 2: " + obj.add(2, 3));
        System.out.println("Sum of 3: " + obj.add(2, 3, 4));
        System.out.println("Sum of 4: " + obj.add(2, 3, 4, 5));
    }
}
