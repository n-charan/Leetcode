package Arrays;//136 leetcode

public class singlenumber {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 1, 3, 1, 4, 4, 5 };
        System.out.println(search(nums, 0, nums.length));
    }

    static int search(int[] nums, int start, int end) {
        int number = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j] && i != j) {
                    count = 1;
                    break;
                }
            }
            if (count == 0) {
                return nums[i];
            }
        }

        return number;
    }
}
