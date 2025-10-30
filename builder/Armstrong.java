
public class Armstrong {

    public static void main(String[] args) {
        int n = 153;
        int flag = n;
        int sum = 0;
        int digits = String.valueOf(n).length();
        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }
        if (sum == flag) {
            System.out.println(flag + "armstrong");
        } else {
            System.out.println(flag + "not arm strong");
        }
    }
}
