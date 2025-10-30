
import java.util.Scanner;

public class CompoundInterest {

    public static void mian(String[] args) {
        int p;
        int r;
        int t;
        Scanner sc = new Scanner(System.in);
        System.out.println("value of p:");
        p = sc.nextInt();
        System.out.println("value of r:");
        r = sc.nextInt();
        System.out.println("value of t");
        t = sc.nextInt();
        int p1 = p * ((1 + r / 100) ^ t) - p;
        System.out.println("compoundintreast=" + p1);
        sc.close();
    }
}
