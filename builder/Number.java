
public class Number {

    public static void main(String[] args) {
        int n = 135;
        int flag = n;
        int digit = 0;
        int sum = 0;
        while (flag > 0) {
            flag = flag / 10;
            digit++;
        }
        flag = n;
        while (flag > 0) {
            int r = flag % 10;
            sum = sum + (int) Math.pow(r, digit--);
            flag /= 10;
        }
        if (sum == n) {
            System.out.println("disarium");
        } else {
            System.out.println("not disarium");
        }
    }
}
