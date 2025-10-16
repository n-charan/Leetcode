package kunalAssignments;

public class Prime {
    public static void main(String[] args) {
        if (isprime(15, 2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    static boolean isprime(int n, int i) {
        if (n <= 2) {
            return false;
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        return isprime(n, i + 1);
    }
}
