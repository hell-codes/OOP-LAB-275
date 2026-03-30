package Overriding;

class Employee {
    void salary() {
        System.out.println("Base salary");
    }
}

class Developer extends Employee {
    void salary() {
        System.out.println("Developer salary:85000");
    }
}

public class Company {
    public static void main(String[] args) {
        Employee e = new Developer();
        e.salary();
    }
    
}
