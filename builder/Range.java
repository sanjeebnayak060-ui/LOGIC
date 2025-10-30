
public class Range {

    public static void main(String[] args) {
        int range = 1000;
        for (int i = 1; i <= 1000; i++) {
            int sum = 0;
            int digit = 0;
            int j = i;
            while (j != 0) {
                j = j / 10;
                digit++;
            }
            j = i;
            while (j != 0) {
                int r = j % 10;
                sum = sum + (int) Math.pow(r, digit);
                j = j / 10;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
