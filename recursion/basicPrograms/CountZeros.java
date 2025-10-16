package recursion.basicPrograms;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(countZeros(30101201,0));
    }
    public static int countZeros(int n,int count){
        if(n==0){
            return count;
        }
        int rem=n%10;
        n=n/10;
        if(rem==0){
            return countZeros(n,count+1);
        }
            return countZeros(n,count);
    }
}
