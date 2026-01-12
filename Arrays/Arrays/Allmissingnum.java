package Arrays;

import java.util.*;

public class Allmissingnum {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 0, 5 };
        System.out.println(search(nums));
    }
    public static List<Integer> search(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int index = nums[i];
            if (nums[i] != nums[index]) {
                swap(nums, i, index);
            } else {
                i++;
            }
        }
        List<Integer> ans=new ArrayList<Integer>();
        for(i=0; i<nums.length; i++) {
            if(nums[i]!=i){
                ans.add(i);
            }
        }
        return ans;
    }
    static void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}