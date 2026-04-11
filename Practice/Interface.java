package Practice;

interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car started");
    }

    public void stop() {
        System.out.println("Car stopped");
    }
}

public class Interface {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.stop();
    }
}
