package BinarySearch;

public class SearchIndex704 {
    public static void main(String[] args) {
        int [] arr={-1,0,2,3,5,7};
        int target=5;
        System.out.println(binarySearch(arr,target));
    }
    public static int binarySearch(int[] arr,int target){
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
                return mid;
            }
        }
        return -1;
    }
}
