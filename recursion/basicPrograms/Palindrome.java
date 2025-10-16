package recursion.basicPrograms;

public class Palindrome {
    static int sum=0;
    public static void rev(int n){
        if(n==0){
            return ;
        }
        int rem=n%10;
        sum=sum*10+rem;
        n=n/10;
        rev(n);
    }
    public static boolean pali(int n){
        sum=0;
        rev(n);
        return n==sum;
    }
    public static void main(String[] args) {
        System.out.println(pali(12121));
    }
}
