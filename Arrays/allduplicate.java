package Arrays;

import java.util.ArrayList;
import java.util.List;

public class allduplicate {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(search(nums));
    }
    public static List<Integer> search(int[] nums) {
        // int[] arr=new int[];
        for (int i = 0; i < nums.length; i++) {
            int index = nums[i] - 1;
            if (nums[i] != nums[index]) {
                swap(nums, i, index);
                i = 0;
            }
        }
        List<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                ans.add(nums[i]);
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
