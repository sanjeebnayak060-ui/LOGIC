
public class Problame1 {

    public static void main(String[] args) {
        int n = 153;
        int sum = 0;
        int digit = 0;
        while (n > 0) {
            n = n / 10;
            digit++;
        }
        System.out.println("no of digit=" + digit);
        while (n > 0) {
            int r = n / 10;
            sum = sum + (int) Math.pow(r, digit);
            n = n / 10;
        }
        if (sum == n) {
            System.out.println(" no is armstrong");

        } else {
            System.out.println(" no is not not armstrong");
        }
    }
}
