package BinarySearch;

public class SearchInRotated2_81 {
    public static void main(String[] args) {
        int[] arr={1,1,3};
        int target=3;
        System.out.println(search(arr,target));
    }

    public static boolean search(int[] arr,int target){
        int pivot=findPivot(arr);
        if(pivot==-1){
            return binarySearch(arr,target,0,arr.length-1);
        }
        if(arr[pivot]==target){
            return true;
        }
        if(target>=arr[0]){
            return binarySearch(arr,target,0,pivot-1);
        }
        else{
            return binarySearch(arr,target,pivot+1,arr.length-1);
        }
    }
    public static boolean binarySearch(int [] arr,int target,int start,int end) {
//
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return true;
            }
        }
        return false;

    }
    public static int findPivot(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                if(start+1<arr.length && arr[start]>arr[start+1]){
                    return start;
                }
                start++;
                if(end-1>=0 && arr[end]<arr[end-1]){
                    return end-1;
                }
                end--;
            }
            else if(arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end])){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return -1;
    }
}
