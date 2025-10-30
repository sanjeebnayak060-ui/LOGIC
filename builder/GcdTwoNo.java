
public class GcdTwoNo {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;

        }
        System.out.println(a);
    }
}
