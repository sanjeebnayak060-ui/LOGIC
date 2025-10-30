
public class NeonNumber {

    public static void main(String[] args) {
        int m = 100;
        for (int n = 1; n <= m; n++) {
            int square;
            int sum = 0;

            square = n * n;
            while (square > 0) {
                sum = sum + (square % 10);
                square = square / 10;
            }
            if (n == sum) {
                System.out.println(n);
            }
        }
    }
}
