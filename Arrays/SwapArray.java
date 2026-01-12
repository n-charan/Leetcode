import java.lang.reflect.Array;
import java.util.*;

public class SwapArray {
    public static void main(String[] args) {
        int[] arr = {11, 9, 6, 4, 21, 54};
        System.out.println(Arrays.toString(swaparray(arr)));
    }

    static int[] swaparray(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length - 1; j++) {
//                if (arr[i] > arr[j + 1]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
        Arrays.sort(arr);

        for(int i=0;i<arr.length-1;i++){
            swap(arr,i,i+1);
            i+=1;
        }
        return arr;
    }
    static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
