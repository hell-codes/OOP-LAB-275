package Constructor;
class Student {
    static int rollCounter = 101;
    int roll;
    String name;
    String course;

    Student() {
        roll = 0;
        name = "Unassigned";
        course = "General";
    }
    Student(String name, String course) {
        this.roll = rollCounter++;
        this.name = name;
        this.course = course;
    }

    Student(Student s) {
        this.roll = rollCounter++;
        this.name = s.name;
        this.course = s.course;
    }

    void display() {
        System.out.println("Roll Number: " + roll);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("------------------");
    }
}

public class EduTrack {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Prabin", "Computer Science");
        Student s3 = new Student(s2);
    
        s1.display();
        s2.display();
        s3.display();
    }
}