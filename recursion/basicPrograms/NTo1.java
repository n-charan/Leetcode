package recursion.basicPrograms;

public class NTo1 {
    public static void main(String[] args) {
       num(5);
       num1(5);
    }
    public static void num(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        num(n-1);
    }
    public static void num1(int n){
        if(n==0){
            return ;
        }
        num1(n-1);
        System.out.print(n);;
    }
}
