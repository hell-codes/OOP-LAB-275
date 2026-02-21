public class TelecomBill {
    public static void main(String[] args) {

        int calls = 120;
        int sms = 80;
        double data = 3.5;

        double callCharge = 0;

        if (calls > 50 && calls <= 150)
            callCharge = (calls - 50) * 1;
        else if (calls > 150)
            callCharge = 100 * 1 + (calls - 150) * 1.5;

        double smsCharge = sms * 0.5;

        double dataCharge = 0;
        if (data > 1 && data <= 5)
            dataCharge = (data - 1) * 50;
        else if (data > 5)
            dataCharge = 4 * 50 + (data - 5) * 30;

        double total = callCharge + smsCharge + dataCharge;

        System.out.println("Call Charge: " + callCharge);
        System.out.println("SMS Charge: " + smsCharge);
        System.out.println("Data Charge: " + dataCharge);
        System.out.println("Total Bill: " + total);
    }
}
