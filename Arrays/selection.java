import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int [] arr={4,2,3};
        sorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sorting(int[] arr){
        for(int i=0; i<arr.length; i++){
            int last=arr.length-i-1;
            int maximum=maxindex(arr, 0, last);
            swap(arr, maximum, last);

        }
    }
    static int maxindex(int[] arr,int start,int end){
        int max=start;
        for(int i=0; i<arr.length-i-1; i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int [] arr,int start,int last){
        int temp=arr[start];
        arr[start]=arr[last];
        arr[last]=temp;
    }
}
