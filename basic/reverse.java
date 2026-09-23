public class reverse {
    public static void main(String[] args) {

        int n = 12321;
        int pal = n;
        int rev = 0;

        while (n != 0) {
            int a = n % 10;
            rev = rev * 10 + a;
            n = n / 10;
        }

        if (rev == pal) {
            System.out.print("It is a palindrome number.");
        } else {
            System.out.print("It is not a palindrome number.");
        }
    }
}
