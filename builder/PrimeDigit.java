
public class PrimeDigit {

    public static void main(String[] args) {
        int n = 2357;
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            if (d == 2 || d == 3 || d == 5 || d == 7) {
                sum = sum + d;
                n = n / 10;
            }

        }
        System.out.println(sum);
    }
}
