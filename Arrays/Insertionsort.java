import java.util.Arrays;

public class Insertionsort {
    public static void main(String[] args) {
        int[] arr={5,3,-1,2,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int [] arr){
        
        for(int i=0; i<arr.length-1;){
            boolean sorted=false;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                    i++;
                    sorted=true;
                }
            }
            i=0;
            if(!sorted){
                break;
            }
        }
    }
}
