import java.lang.reflect.Array;
import java.util.*;
import java.lang.*;

public class reverse{

    static void reverseArray(int[] arr){

        // int left=0;
        // int right=arr.length-1;
        // System.out.println(arr);
        // while(left<right){
        //     int temp=arr[left];   //O(n)
        //     arr[left]=arr[right];
        //     arr[right]=temp;
        //     left++;
        //     right--;
        // }
        int r=arr.length-1;
        for(int l=0;l<arr.length;l++){
                if(l<r){
                    int temp=arr[l];   //O(n)
                    arr[l]=arr[r];
                    arr[r]=temp;
                    r--;
                }
            }
        }

    public static void main(String[] args) {
        int[] arr={3,7,2,8,1};
        reverseArray(arr);
        
        for(int i=0; i<arr.length; i++) {
            System.out.print( " "+arr[i]);
        }
    }
}