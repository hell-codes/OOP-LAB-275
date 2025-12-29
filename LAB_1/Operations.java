import java.util.Scanner;
public class Operations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first num:");
        int a = input.nextInt();
        
        System.out.println("Enter second num:");
        int b = input.nextInt();

        System.out.println("Add: " +(a+b));
        System.out.println("Sub: " +(a-b));
        System.out.println("Mul: " +(a*b));
        System.out.println("Div: " +(a/b));
        System.out.println("Mod: " +(a%b));

        input.close();
    }
}
