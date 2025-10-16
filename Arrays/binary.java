public class binary {
    public static void main(String[] args) {
        int[ ] arr={2,5,6,9,12,25,65,78,98};
        int target=65;
        System.out.println(searching(arr, target));
    }
    static int searching(int[] arr, int target){

        int start=0;
        int end=arr.length;
        while (start<=end) {
            
            int mid=(start+end)/2;
                if(arr[mid]>target){
                    end=mid;
                }
                else if(arr[mid]<target){
                    start=mid;
                }
                else if(arr[mid]==target){
                    return mid;
                }
            }
        return 0;

    }
}
