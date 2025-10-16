import java.lang.*;
import java.util.Arrays;

public class twoDsearch {
    public static void main(String[] args) {
        int[][] arr={{4,5,3},{8,1,9},{6,4,2}};
        int target=6;
        int[] res=search(arr,target);
        System.out.println(Arrays.toString(res));
        
    }
    static int[] search(int[][] arr,int target){

        for(int r=0;r<arr.length;r++){
            for(int c=0;c<arr[r].length;c++){
                if(arr[r][c]==target){
                    return new int[]{r,c};
                }
            }
        }
        return new int[]{-1};
}
}
