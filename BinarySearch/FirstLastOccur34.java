package BinarySearch;

import java.util.Arrays;

public class FirstLastOccur34 {
    public static void main(String[] args) {
        int [] arr={5,6,7,7,8,8,10};
        int target=7;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    public static int[] search(int[] arr, int target){
        int[] res={-1,-1};
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                res[0]=mid;
                end=mid-1;
            }
        }

        start=0;
        end=arr.length-1;
        while(start<=end){

            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                res[1]=mid;
                start=mid+1;
            }
        }
        return res;
    }
}
