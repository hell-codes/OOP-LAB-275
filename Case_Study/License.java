public class License {
    public static void main(String[] args) {

        int age = 19;
        String type = "Car";

        if (type.equals("Car")) {
            if (age >= 18)
                System.out.println("Eligible for Car License");
            else
                System.out.println("Not Eligible for Car License");
        }
        else if (type.equals("Commercial")) {
            if (age >= 20)
                System.out.println("Eligible for Commercial License");
            else
                System.out.println("Not Eligible for Commercial License");
        }
        else if (type.equals("Motorcycle")) {
            if (age >= 16)
                System.out.println("Eligible for Motorcycle License");
            else
                System.out.println("Not Eligible for Motorcycle License");
        }
        else {
            System.out.println("Invalid License Type");
        }
    }
}
