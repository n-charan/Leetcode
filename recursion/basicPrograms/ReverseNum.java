package recursion.basicPrograms;

public class ReverseNum {
    static int sum=0;
    public static void reverse(int n){
        if(n==0){
            return ;
        }
        int rem=n%10;
        sum=sum*10+rem;
        n=n/10;
        reverse(n);

    }
    public static void main(String[] args) {
        reverse(12332);
        System.out.println(sum);

    }
}
