package recursion.basicPrograms;

public class SumOfDigits {
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        int rem=n%10;
        n=n/10;
        return rem+sum(n);
    }
    public static void main(String[] args) {
        System.out.println(sum(123412));
        System.out.println(prod(212345));
    }
    public static int prod(int n){
        if(n==0){
            return 1;
        }
        int rem=n%10;
        n=n/10;
        return rem*prod(n);
    }
}
