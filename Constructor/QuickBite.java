package Constructor;
class Order {
    String item;
    int quantity;
    String address;
    String instruction;

    Order() {
        item = "Momos";
        quantity = 1;
        address = "Chennai";
        instruction = "Spicy";
    }
    Order(String item, int quantity) {
        this.item = item;
        this.quantity = quantity;
        address = "Thiruvallur";
        instruction = "Normal";
    }
    Order(String item, int quantity, String address, String instruction) {
        this.item = item;
        this.quantity = quantity;
        this.address = address;
        this.instruction = instruction;
    }
    void display() {
        System.out.println("Item: " + item);
        System.out.println("Quantity: " + quantity);
        System.out.println("Address: " + address);
        System.out.println("Instruction: " + instruction);
        System.out.println("------------------");
    }
}
public class QuickBite {
    public static void main(String[] args) {
        Order o1 = new Order();
        Order o2 = new Order("Momos", 2);
        Order o3 = new Order("Burger", 3, "Chennai", "Medium Spicy");
        o1.display();
        o2.display();
        o3.display();
    }
}