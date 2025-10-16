package kunalAssignments;

public class sumofn {
    public static void main(String[] args) {
        System.out.println(sumof(5));
    }
    static int sumof(int n){
        if(n==1){
            return 1;
        }
        int num=sumof(n-1); 
        int sum1=n+num;
        return sum1;
    }
}
