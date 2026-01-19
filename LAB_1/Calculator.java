import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int choose;

        do {
            System.out.println("\n1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            choose = myObj.nextInt();

            if (choose >= 1 && choose <= 4) {
                System.out.println("Enter first number: ");
                int a = myObj.nextInt();
                System.out.println("Enter second number: ");
                int b = myObj.nextInt();

                switch (choose) {
                    case 1: System.out.println("Result = " + (a + b)); 
                    break;
                    case 2: System.out.println("Result = " + (a - b)); 
                    break;
                    case 3: System.out.println("Result = " + (a * b)); 
                    break;
                    case 4: System.out.println("Result = " + (a / b)); 
                    break;
                   
                }
            }

        } while (choose != 5);

        System.out.println("Calculator Closed.");
        myObj.close();
    }
}
