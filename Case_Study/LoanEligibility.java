import java.util.Scanner;

public class LoanEligibility {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Income: ");
        double income = sc.nextDouble();

        System.out.print("Enter Credit Score: ");
        int score = sc.nextInt();

        double loan = 0;
        String decision;

        if(score >= 750 && income >= 50000) {
            loan = 1000000;
            decision = "Approved (10 Lakhs)";
        }
        else if(score >= 650 && income >= 30000) {
            loan = 500000;
            decision = "Approved (5 Lakhs)";
        }
        else {
            decision = "Rejected";
        }

        System.out.println("Customer: " + name);
        System.out.println("Decision: " + decision);
        if (!decision.equals("Rejected")) {
            System.out.println("Loan Amount: " + loan);
        }
        sc.close();
    }
    
}