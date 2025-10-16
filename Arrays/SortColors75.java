package Arrays;

import java.util.Arrays;

public class SortColors75 {
    public static void main(String[] args) {
        int [] nums={2,2,0,1};
        System.out.println(Arrays.toString(sortColors(nums)));
    }
    public static int[] sortColors(int [] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]>=nums[j]) {
                    swap(nums, i, j);
                }
            }
        }
        return nums;
    }
    public static void swap(int [] nums,int i,int j){
        int temp;
        temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;

    }
}
