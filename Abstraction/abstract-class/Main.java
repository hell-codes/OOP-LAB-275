abstract class Vehicle {
    abstract void start();

    void fuel() {
        System.out.println("Fuel filled");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.start();
        v.fuel();
    }
}
