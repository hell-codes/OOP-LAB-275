package Overloading;

public class Example {
    public static void main(String[] args) {
        System.out.println("Hello");
        Example.main("Students");
    }

    public static void main(String arg1) {
        System.out.println("Welcome " + arg1);
        Example.main("Welcome", "to java");
    }

    public static void main(String arg1, String arg2) {
        System.out.println("Hi " + arg1 + " " + arg2);
    }
}