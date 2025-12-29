import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first num:");
        double a = input.nextDouble();
        
        System.out.println("Enter second num:");
        double b = input.nextDouble();

        // Arithmetic Operators
        System.out.println("\n--- Arithmetic Operators ---");
        System.out.println("Add: " +(a+b));
        System.out.println("Sub: " +(a-b));
        System.out.println("Mul: " +(a*b));
        System.out.println("Div: " +(a/b));
        System.out.println("Mod: " +(a%b));

       // Increment & Decrement
        System.out.println("\n--- Increment / Decrement ---");
        System.out.println("Increment(a++): " +(a++)); //use value then add 1
        System.out.println("Decrement(a--): " +(a--)); //use value then minus 1
        System.out.println("Increment(++a): " +(++a)); //add 1 then use value
        System.out.println("Increment(--a): " +(--a)); //minus 1 then use value

        System.out.println("Increment(b++): " +(b++)); //use value then add 1
        System.out.println("Decrement(b--): " +(b--)); //use value then minus 1
        System.out.println("Increment(++b): " +(++b)); //add 1 then use value
        System.out.println("Increment(--b): " +(--b)); //minus 1 then use value

        // Relational Operators
        System.out.println("\n--- Relational Operators ---");
        System.out.println("a == b: " +(a == b));
        System.out.println("a != b: " +(a != b));
        System.out.println("a > b: " +(a > b));
        System.out.println("a < b: " +(a < b));
        System.out.println("a >= b: " +(a >= b));
        System.out.println("a <= b: " +(a <= b));

        // Logical Operators
        System.out.println("\n--- Logical Operators ---");
        System.out.println("(a > b) && (a != b): " + ((a > b) && (a != b)));
        System.out.println("(a > b) || (a == b): " + ((a > b) || (a == b)));
        System.out.println("!(a == b): " + (!(a == b)));

        input.close();
    }
}
