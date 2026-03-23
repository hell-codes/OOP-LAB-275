package Overloading;

public class Div {
    public int ssr(int a, int b) {
        return (a / b);
    }

    public int ssr(int a, int b, int c) {
        return ((a + b) / c);
    }

    public static void main(String[] args) {
        Div ob = new Div();

        System.out.println(ob.ssr(10, 2));     
        System.out.println(ob.ssr(10, 2, 3));  
    }
}