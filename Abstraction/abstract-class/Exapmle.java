abstract class Person {
    Person() {
        System.out.println("Person created");
    }

    abstract void work();
}

class Engineer extends Person {
    void work() {
        System.out.println("Engineer works");
    }
}

public class Exapmle {
    public static void main(String[] args) {
        Engineer e = new Engineer();
        e.work();
    }
}
