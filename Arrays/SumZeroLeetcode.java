package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SumZeroLeetcode {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findZeroArray(3)));
    }
    public static int[] findZeroArray(int n){
        int start=0;
        int end=n-1;
        int[] arr=new int[n];
        while(start<end){
//            arr[start]=(int)(Math.random()*10);
//            arr[end]=(int) arr[start]*-1;
            arr[start] = start+1;
            arr[end] = -1*(start+1);
            start++;
            end--;
        }
        return arr;
    }
}


//    public static void findZeroArray(int n){
//        int[] arr = new int[n];
//
//        if(n%2==0){
//            for(int i=0;i<n;i++){
//                for(int j=i+1;j>i;j--){
//                    if(arr[j] == arr[j-1]){
//                        arr[j] = arr[j]+1;
//                    }
//                }
//            }
//        }else{
//
//        }
//
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//
//        findZeroArray(n);
//    }
//}
