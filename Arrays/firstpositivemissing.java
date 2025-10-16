package Arrays;

public class firstpositivemissing {
    public static void main(String[] args) {
        int[] nums = { 7, 8, 89 };
        System.out.println(search(nums));
    }

    static int search(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int Index = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[Index]) {
                swap(nums, i, Index);
                i = 0;

            }
            i++;
        }
        for (int j = 0; j < nums.length; j++) {

            if (nums[j] != j + 1) {
                return j + 1;
            }
        }
        return nums.length + 1;
    }

    static void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
