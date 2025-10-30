
import java.util.Scanner;

public class SimpleIntreast {

    public static void main(String[] args) {
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
        int p1 = (p * r * t) / 100;
        System.out.println("simpleinterst=" + p1);
        sc.close();
    }
}
