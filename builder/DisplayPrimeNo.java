
public class DisplayPrimeNo {

    public static void main(String[] args) {
        int n = 30;
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            boolean flag = true;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i + "");
                sum = sum + i;

            }
        }
        System.out.println(sum);
    }
}
