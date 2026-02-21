package Constructor;
class Patient {
    static int counter = 1001;
    int id;
    String name;
    int age;
    String ward;
    String notes;

    Patient() {
        id = counter++;
        name = "Unknown";
        age = 0;
        ward = "Emergency";
        notes = "None";
    }

    Patient(String name, int age, String ward,String notes) {
        id = counter++;
        this.name = name;
        this.age = age;
        this.ward = ward;
        this.notes = notes;
    }

    Patient(Patient p) {
        this.id = counter++;
        this.name = p.name;
        this.age = p.age;
        this.ward = p.ward;
        this.notes = p.notes;
    }
    void display() {
        System.out.println("Patient ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ward: " + ward);
        System.out.println("Notes: " + notes);
        System.out.println("------------------");
    }
}

public class HospitalReg {
    public static void main(String[] args) {
        Patient p1 = new Patient();
        Patient p2 = new Patient("Alice", 30, "OPD", "Diabetic");
        Patient camp = new Patient("Ravi", 40, "Camp","Hypertension"); 
        Patient p3 = new Patient(camp);
        p1.display();
        p2.display();
        p3.display();
    }
}
