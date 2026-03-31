interface Machine {
    void run();

    default void info() {
        System.out.println("Machine info");
    }
}
class Printer implements Machine {
    public void run() {
        System.out.println("Printer runs");
    }
}
public class Default {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.run();
        p.info();
    }
}
