import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in);

        int total = 0;
        int subjects = 5;

        System.out.println("Enter marks of 5 subjects:");

        for (int i = 1; i <= subjects; i++) 
       {
            System.out.println("Subject " + i + ": ");
            int marks = Obj.nextInt();
            total = total + marks;
        }

        double average = total /5.0;

        System.out.println("Total Marks = " + total);
        System.out.println("Average Marks = " + average);

        if (average >= 40)
            System.out.println("Result: Pass");
        else
            System.out.println("Result: Fail");
        Obj.close();
    }
}
