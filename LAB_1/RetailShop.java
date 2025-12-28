public class RetailShop {
    public static void main(String[] args) {
        int itema = 200 , itemb = 75 , itemc = 300;
        double price;
        price = ((itema*2) + (itemb) + (itemc*3));
        price = price - (price*.1);
        price = price + (price*.05);

        if (price > 1500) {
            price = price - (price*.5);
        }
        else {
            System.out.println("Not eligible for discount.");
        }
        System.out.println("Total Price: " + price);
    }
}
