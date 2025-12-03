
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={3,5,4,6,2,1,1};
        arr=mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);

    }
    public static int[] merge(int[] left,int[] right){

        int[] newarr=new int[left.length+right.length];

        int i=0,j=0,k=0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                newarr[k]=left[i];
                i++;
            }else{
                newarr[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            newarr[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            newarr[k]=right[j];
            j++;
            k++;
        }
        return newarr;
    }
}
