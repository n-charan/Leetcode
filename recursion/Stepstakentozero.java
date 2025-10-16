package recursion;

public class Stepstakentozero {
    public static void main(String[] args) {
        
        System.out.println(steps(123));
    }
    static int count=0;
    static int steps(int n) {
        
        if (n == 0) {
            return count;
        }
        if (n % 2 == 0) {
            count++;
            n = n / 2;
        }
        if (n % 2 != 0) {
            count++;
            n = n - 1;
        }
        return steps(n);
    }
}
