public class searchmountain {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4,5,4,3,1};
        int target=3;
        se(arr, 3);
    }
    static int se(int[] arr, int i){
        int peak=findpeak(arr);
        int first=search(arr, i, 0, peak);
        if(first!=-1){
            return first;
        }else{
            return 0;
        }
    }
    static int findpeak(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while(start<end) {
            int mid=(start+end)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else if(arr[mid]<arr[mid+1]){
                start=mid+1;
            }
        }
        return start;
    }


    static int search(int[] arr,int target,int start,int end){
        boolean isAsc=arr[start]<arr[end];
        while(start<end){
            int mid=(start+end)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(isAsc){
                if(target>=arr[mid]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }else{
                if(target>=arr[mid]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
            
        }
    return -1;
}
}
