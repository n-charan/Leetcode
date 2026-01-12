import java.util.Arrays;

public class StartZeros {
    public static void main(String[] args) {
        int [] arr={0,1,0,3,0,2,0};
        System.out.println(Arrays.toString(zeros(arr)));
    }
    static int[] zeros(int[] arr){
        for (int i=arr.length-1;i>=0;i--){
            for (int j=i-1;j>=0;j--) {
                if (arr[i] == 0  && arr[j]!=0) {
                    swap(arr, i, j);

                }
            }
        }
        return arr;

    }
    static void swap(int[] arr,int start,int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
