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
       
        System.out.println("Increment(a++): " +(a++)); //use value then add 1
        System.out.println("Decrement(a--): " +(a--)); //use value then minus 1
        System.out.println("Increment(++a): " +(++a)); //add 1 then use value
        System.out.println("Increment(--a): " +(--a)); //minus 1 then use value

        System.out.println("Increment(b++): " +(b++)); //use value then add 1
        System.out.println("Decrement(b--): " +(b--)); //use value then minus 1
        System.out.println("Increment(++b): " +(++b)); //add 1 then use value
        System.out.println("Increment(--b): " +(--b)); //minus 1 then use value


        input.close();
    }
}
