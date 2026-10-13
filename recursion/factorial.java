
package recursion;

public class factorial {

    int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        factorial fact = new factorial();
        int result = fact.factorial(8);
        System.out.println(result);
    }
}