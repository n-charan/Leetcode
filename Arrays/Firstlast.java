import java.lang.reflect.Array;
import java.util.Arrays;

public class Firstlast {
    public static void main(String[] args) {
        int [] arr={1,2,6,6,6,6,6,7,8,8,10,12,14,17,20};
        int target=6;
        int[] res=search(arr, target);
        System.out.println(Arrays.toString(res));
    }
    static int[] search(int [] arr, int target){
        int[] ans={-1,-1};
        int s=first(arr,target,true);
        int e=first(arr,target,false);
        
        ans[0]=s;
        ans[1]=e;
        return ans;
    }
    static int first(int[] arr, int target,boolean firstIndex){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }else{
                ans=mid;
                if(firstIndex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
