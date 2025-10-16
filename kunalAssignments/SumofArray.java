package kunalAssignments;

import java.util.Arrays;



public class SumofArray {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        sum(arr);
    }
    static void sum(int[] arr){
        if(arr.length<1){
            return; 
        }
        int[] temp = new int[arr.length-1];

        for(int i=0; i<arr.length-1; i++){
            int add=arr[i]+arr[i+1];
            temp[i] = add;
        }
        sum(temp);
        System.out.println(Arrays.toString(arr));
        
        
    }
}

