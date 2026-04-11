package Packages;

public class MainApp {

    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Aman", 50000);
        Employee e2 = new Employee(102, "Rohit", 60000);

        e1.display();
        System.out.println("----------------");
        e2.display();
    }
}
