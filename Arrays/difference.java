import java.util.Arrays;

public class difference {
    public static void main(String[] args) {
        int[] arr={1,4,3,10,5,60};
        int[] res=minimumdiff(arr);
        System.out.println(Arrays.toString(res));
    }
    static int[] minimumdiff(int [] arr){

        int min_diff=Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>=arr[j]){
                    int diff=arr[i]-arr[j];
                    if(diff<min_diff){
                        min_diff=diff;
                    }
                    
                }
                else if(arr[i]<=arr[j]){
                    int diff=arr[j]-arr[i];
                    if(diff<min_diff){
                        min_diff=diff;
                    }
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int x=arr[i]-arr[j];
                if(x==min_diff){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
        return new int[]{min_diff};

    }
}
