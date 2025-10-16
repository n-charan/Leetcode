public class orderAgnosticBS {
    public static void main(String[] args) {
        
        int[] arr={1,4,6,9,13,17,26,46,89};
        int target=46;
        System.out.println(orderBS(arr, target));
    }
    static int orderBS(int[] arr,int target){

        int s=0;
        int end=arr.length-1;
        boolean isAsc=arr[s]<arr[end];
        while(s<=end){
            int mid=(s+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc==true){
                if(target<arr[mid]){
                    end=mid;
                }else{
                    s=mid;
                }
            }else{
                if(target>arr[mid]){
                    end=mid;
                }else{
                    s=mid;
                }
            }

    }
    return -1;
}
}
