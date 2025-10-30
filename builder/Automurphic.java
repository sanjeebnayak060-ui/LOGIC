
public class Automurphic {

    public static void main(String[] args) {
        int n = 100;
        int square = n * n;

        for (int i = 1; i <= n; i++) {
            int digits = Integer.toString(n).length();
            int lastdigits = square % (int) Math.pow(10, digits);

            if (n == lastdigits) {
                System.out.println(lastdigits + "no is automorphic");
            } else {
                System.out.println(lastdigits + "no is not automorphic");
            }
        }
    }
}
