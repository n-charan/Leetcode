package BinarySearch;

public class SingleElement540 {
    public static void main(String[] args) {
        int [] arr={1,1,2,2,3,3,4,4,5};
        System.out.println(search(arr));
    }
    public static int search(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(mid%2==0){
                mid--;
            }
            if(arr[mid]!=arr[mid+1]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return arr[start];
    }
}
