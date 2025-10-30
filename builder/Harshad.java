
public class Harshad {

    public static void main(String[] args) {
        int n = 25;
        int temp = n;
        while (temp > n) {
            int sum = 0;
            sum += temp % 10;
            temp /= 10;
        }
        if (temp == n) {
            System.out.println(n + "no is harshad");
        } else {
            System.out.println(n + "no is not harshad");
        }
    }
}
