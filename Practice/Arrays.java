package Practice;

public class Arrays {
    public static void main(String[] args) {

        int marks[] = {70, 85, 90, 60, 95};
        int sum = 0, max = marks[0];

        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
            if (marks[i] > max)
                max = marks[i];
        }

        double avg = sum / marks.length;

        System.out.println("Average: " + avg);
        System.out.println("Top Score: " + max);
    }
}
