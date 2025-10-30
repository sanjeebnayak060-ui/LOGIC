
public class Largest {

    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int c = 20;
        if (a >= b && a >= c) {
            System.out.println("no is largest" + a);
        }
        if (b >= a && b >= c) {
            System.out.println("no is largest" + b);

        }
        if (c >= a && c >= b) {
            System.out.println("no is largest" + c);
        }
    }
}
