public class Bonus {
    public static void main(String[] args) {

        String name = "Ramesh";
        double salary = 40000;
        int experience = 7;
        String department = "Hazardous";

        double bonusPercent;

        if (experience < 2)
            bonusPercent = 0;
        else if (experience <= 5)
            bonusPercent = 10;
        else if (experience <= 10)
            bonusPercent = 20;
        else
            bonusPercent = 35;

        double bonus = salary * bonusPercent / 100;

        if (department.equalsIgnoreCase("Hazardous"))
            bonus += 5000;

        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Experience: " + experience);
        System.out.println("Department: " + department);
        System.out.println("Total Bonus: " + bonus);
    }
}
