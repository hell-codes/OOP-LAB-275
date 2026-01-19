import java.util.Scanner;

public class ATMpin {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        int correctPin = 1845;
        int enteredPin = 0;
        int attempts = 0;

        while (enteredPin != correctPin && attempts < 3) 
        {
            System.out.println("Enter your PIN: ");
            enteredPin = myObj.nextInt();
            attempts++;

            if (enteredPin != correctPin)
                System.out.println("Wrong PIN. Try again.");
        }

        if (enteredPin == correctPin)
            System.out.println("Access Granted");
        else
            System.out.println("Card Blocked. Too many attempts.");
        myObj.close();
    }
}
