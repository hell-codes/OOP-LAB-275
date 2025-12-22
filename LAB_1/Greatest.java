public class Greatest {
    public static void main(String[] args) {
        int a=20;
        int b=34;
        int c=45;

        if (a>=b && a>=c) {
            System.out.println("Greatest is: "+ a);
        }
        else if (b>=a && b>=c) {
            System.out.println("Greatest is: "+ b);
        }
        else {
            System.out.println("Greatest is: "+ c);
        }
    }
}
