package recursion;

public class Countingzeros {
    public static void main(String[] args) {
        System.out.println(zeros(102060,0));
    }
    static int zeros(int n,int count){
        
        if(n==0){
            return count;
        }
        int rem=n%10;
        if(rem==0){
            count++;
        }
        return zeros(n/10,count);
        
        
    }
}
