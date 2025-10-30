
public class EvenNoRange {

    public static void main(String[] args) {
        int start = 10;
        int end = 20;
        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
