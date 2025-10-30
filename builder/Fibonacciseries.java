
public class Fibonacciseries {

    public static void main(String[] args) {
        int n = 5;
        int first = 0;
        int second = 1;
        System.out.println("fibonacciseries:" + first + "" + second);
        for (int i = 2; i < n; i++) {
            int thired = first + second;
            System.out.println(+thired);
            first = second;
            second = thired;

        }

    }
}
