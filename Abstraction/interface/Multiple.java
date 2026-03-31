interface Device {
    void start();
    void stop();
}
class Fan implements Device {
    public void start() {
        System.out.println("Fan starts");
    }
    public void stop() {
        System.out.println("Fan stops");
    }
}
public class Multiple {
    public static void main(String[] args) {
        Fan f = new Fan();
        f.start();
        f.stop();
    }
}
