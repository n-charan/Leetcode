package Arrays;

import java.util.Arrays;

public class Zerosend {
    public static void main(String[] args) {
        int[] nums={0,2,3,0,1};
        move_end(nums);
        System.out.println(Arrays.toString(nums));
    }
    static int move_end(int[] nums){
        for(int i=0; i<nums.length;i++){
            
            if(nums[i]==0){
                swap(nums,i,nums.length-1);
            }
        }
        return -1;
    }
    static void swap(int[] nums, int start, int end){
        int emp=nums[start];
        nums[start]=nums[end];
        nums[end]=emp;

    }
}
