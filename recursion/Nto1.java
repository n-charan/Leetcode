package recursion;

public class Nto1 {
    public static void main(String[] args) {
        function(10);
    }

    static void function(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        function(n - 1);
    }
}
