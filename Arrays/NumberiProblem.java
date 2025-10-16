package Arrays;

import java.util.Scanner;

public class NumberiProblem {

    public static int count(int n){
        int c = 0;
        while(n > 0){
            c++;
            n /= 10;
        }
        return c;
    }

    public static boolean checkNum(int num){
        while(num > 0){
            int rem = num%10;
            if(rem == 0){
                return true;
            }
            num /= 10;
        }
        return false;
    }

    public static int[] getNoZeroIntegers(int n){
        int[] arr = new int[2];
        int k = 0;

        arr[0] = n-1;
        arr[1] = n-arr[0];

        while(true){
            boolean a = false;
            boolean b = false;
            if(checkNum(arr[0])){
               int t = (int) Math.pow(10, count(arr[0])-1);
               k = (arr[0]%10)+1;
               arr[0] = arr[0]-k;
               arr[1]+=k;
               a = true;
            }

            if(checkNum(arr[1])){
                arr[1]+=1;
                arr[0]-=1;
                b = true;
            }

            if(!a&&!b){
                break;
            }
        }
        return  arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] out = getNoZeroIntegers(n);

        for(int i: out){
            System.out.print(i+" ");
        }
    }
}
//
//class Solution {
//    public int[] getNoZeroIntegers(int n) {
//
//        int[] arr=new int[2];
//        arr[0]=n-1;
//        arr[1]=n-arr[0];
//
//        if(arr[1]%10==0){
//            int rem2=arr[1]%10;
//            arr[1]=arr[1]-rem2-1;
//            arr[0]=n-arr[1];
//
//        }else if(arr[0]%10==0){
//            int rem=arr[0]%10;
//            arr[0]=arr[0]-rem-1;
//            arr[1]=n-arr[0];
//        }
//        else{
//            if(n>10){
//                int rem=arr[0]%10;
//                arr[0]=arr[0]-rem-1;
//                arr[1]=n-arr[0];
//            }
//            if(n<10){
//                arr[0]=n-1;
//                arr[1]=n-arr[0];
//            }
//        }
//
//        return arr;
//    }
//
//}
