package recursion;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr ={1,2,3,45,6};
        System.out.println(search(arr,6,0));
    }
    public static int search(int[] arr, int target, int i){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        return search(arr,target,i+1);
    }
}
