import java.util.Scanner;
public class AddData {
    public static void main (String[] args){
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter first num:");
        float a = obj.nextFloat();

        System.out.println("Enter second num:");
        float b = obj.nextFloat();

        System.out.println("Sum: " +(a+b));
        obj.close();
    }
}
