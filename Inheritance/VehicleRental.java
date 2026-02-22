package Inheritance;
import java.util.Scanner;

class Vehicle {
    String brand;
    String model;
    double rental_price;

    Vehicle(String brand, String model, double rental_price) {
        this.brand = brand;
        this.model = model;
        this.rental_price = rental_price;
    }

    void display_Info() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Rental Price: " + rental_price);
    }
}

class Car extends Vehicle {
    String fuel_type;

    Car(String brand, String model, double price, String fuel_type) {
        super(brand, model, price);
        this.fuel_type = fuel_type;
    }

    void display_Info() {
        super.display_Info();
        System.out.println("Fuel Type: " + fuel_type);
    }
}

class Bike extends Vehicle {
    double engine_capacity;

    Bike(String brand, String model, double price, double engine_capacity) {
        super(brand, model, price);
        this.engine_capacity = engine_capacity;
    }

    void display_Info() {
        super.display_Info();
        System.out.println("Engine Capacity: " + engine_capacity);
    }
}
public class VehicleRental {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Car Details:");
        System.out.print("Brand: ");
        String carBrand = sc.nextLine();
        System.out.print("Model: ");
        String carModel = sc.nextLine();
        System.out.print("Rental Price: ");
        double carPrice = sc.nextDouble();
        sc.nextLine(); 
        System.out.print("Fuel Type: ");
        String fuelType = sc.nextLine();
        Car c = new Car(carBrand, carModel, carPrice, fuelType);

        System.out.println("\nEnter Bike Details:");
        System.out.print("Brand: ");
        String bikeBrand = sc.nextLine();
        System.out.print("Model: ");
        String bikeModel = sc.nextLine();
        System.out.print("Rental Price: ");
        double bikePrice = sc.nextDouble();
        System.out.print("Engine Capacity: ");
        double engineCapacity = sc.nextDouble();
        Bike b = new Bike(bikeBrand, bikeModel, bikePrice, engineCapacity);

        System.out.println("\nCar Details:");
        c.display_Info();

        System.out.println("\nBike Details:");
        b.display_Info();

        sc.close();
    }
}