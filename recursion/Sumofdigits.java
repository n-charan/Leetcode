package recursion;

public class Sumofdigits {
    public static void main(String[] args) {
        System.out.println(sumOf(12345678));
    }

    static int sumOf(int n) {

        if (n == 0) {
            return n;
        }

        return n % 10 + sumOf(n / 10);
    }
}
