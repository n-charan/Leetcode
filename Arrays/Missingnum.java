package Arrays;//268 leetcode

public class Missingnum {
    public static void main(String[] args) {
        int[] nums = { 0,1,2,3,4};
        System.out.println(search(nums));

    }

    static int search(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int index = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[index]) {
                swap(nums, i, index);
            } else {
                i++;
            }
        
        }
        for (i = 0; i < nums.length; i++) {
            int index = i;
            if (nums[i] != index) {
                return index;
            }
        }
        return nums.length;

    }

    static void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
