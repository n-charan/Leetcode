package recursion;

public class Reverseanum {
    public static void main(String[] args) {
        rev(1234674939);
    }
    static void rev(int n){
        if(n==0){
            return ;
        }
        System.out.print(n%10);
        rev(n/10);
    }
}