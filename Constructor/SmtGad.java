package Constructor;
class Device {
    String name;
    String status;
    String firmware;

    Device() {
        name = "SG-Device";
        status = "Inactive";
        firmware = "v1.0";
        display();
    }
    Device(String name, String firmware) {
        this.name = name;
        this.firmware = firmware;
        status = "Inactive";
        display();
    }
    Device(String name, String firmware, String status) {
        this.name = name;
        this.firmware = firmware;
        this.status = status;
        display();
    }
    void display() {
        System.out.println("Device Name: " + name);
        System.out.println("Firmware Version: " + firmware);
        System.out.println("Status: " + status);
        System.out.println("------------------");
    }
}
public class SmtGad {
    public static void main(String[] args) {
        new Device();
        new Device("SG-Cam", "v2.0");
        new Device("SG-Light", "v3.1", "Active");
    }
}