
public class PerfectNo {

    public static void main(String[] args) {
        int n = 1025;
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
                
            }
        }
        if (sum == n) {
            System.out.println(n + "no is perfect");

        } else {
            System.out.println(n + "no is perfect");
        }
    }
}
