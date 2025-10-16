package recursion;

public class Stepstozero {
    public static void main(String[] args) {
        System.out.println(stepsNeeded(9));
    }

    static int stepsNeeded(int n) {
        return helper(n, 0);
    }

    static int helper(int n, int count) {
        if (n == 0) {
            return count;
        }
        if (n % 2 == 0) {
            return helper(n / 2, count + 1);
        }
        return helper(n - 1, count + 1);
    }
}
