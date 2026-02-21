package Constructor;
class Reservation {
    String guestName;
    String roomType;
    int floor;
    double rate;

Reservation() {
    guestName = "Walk-in Guest";
    roomType = "Standard";
    floor = 0;
    rate = 2000;
}
Reservation(String name, String roomType, int floor, double rate) {
    this.guestName = name;
    this.roomType = roomType;
    this.floor = floor;
    this.rate = rate;
} 
Reservation(Reservation r) {
    this.guestName = r.guestName;
    this.roomType = r.roomType;
    this.floor = r.floor;
    this.rate = r.rate;
}
void diaplay() {
    System.out.println("Guest Name: " + guestName);
    System.out.println("Room Type: " + roomType);
    System.out.println("Floor: " + floor);
    System.out.println("Rate: " + rate);
    System.out.println("------------------");
}
}
public class RoyalStay {
    public static void main(String[] args) {
        Reservation r1 = new Reservation();
        Reservation r2 = new Reservation("Image", "Deluxe", 5, 5000);
        Reservation r3 = new Reservation(r2);
        r3.guestName = "Prabin";
        r1.diaplay();
        r2.diaplay();
        r3.diaplay();
    }
}
