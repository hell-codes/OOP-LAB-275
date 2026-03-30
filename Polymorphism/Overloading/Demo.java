package Overloading;

class MathOps {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class AdvancedMath extends MathOps {

    int add(int a, int b) {
        return (a + b) * 2;
    }
}

public class Demo {
    public static void main(String[] args) {

        MathOps m = new MathOps();
        System.out.println(m.add(2, 3));
        System.out.println(m.add(2, 3, 4));

        MathOps obj = new AdvancedMath();
        System.out.println(obj.add(2, 3));
    }
}
