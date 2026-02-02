import java.util.Scanner;

public class Attendance {
    public static void main(String[] args) {
        Scanner Obj = new Scanner(System.in);

        for (int roll = 1; roll <= 10; roll++) {
            System.out.println("Is Roll " + roll + " present? (1=Yes, 0=No): ");
            int status = Obj.nextInt();

            if (status == 0)
                continue;

            System.out.println("Marked Present: Roll " + roll);

            if (roll == 8) {
                System.out.println("Teacher left class. Attendance stopped.");
                break;
            }
        }
         Obj.close();
    }
}
