
public class Dcount {

    public static void main(String[] args) {
        int n = 25;
        int m = n;
        int digit = 0;
        while (m != 0) {
            m = m / 10;
            digit++;
        }
        int square = n * n;
        int temp = (int) Math.pow(10, digit);
        int result = square % temp;
        if (n == result) {
            System.out.println(n);
        }
    }
}
