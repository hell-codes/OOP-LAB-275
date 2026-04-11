package Packages;

public class Student {

    int id;
    String name;
    int marks;

    public Student(int i, String n, int m) {
        id = i;
        name = n;
        marks = m;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("-------------------");
    }

    public static void main(String[] args) {

        Student s1 = new Student(1, "Devil", 90);
        Student s2 = new Student(2, "Image", 85);

        s1.display();
        s2.display();
    }
}
