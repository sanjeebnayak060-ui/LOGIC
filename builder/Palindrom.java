
public class Palindrom {

    public static void main(String[] args) {
        int n = 121;
        int rev = 0, temp = n;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n = n / 10;
        }
        if (rev == temp) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}
