package Arrays;

public class SIP {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 5, 6 };
        System.out.println(search(nums, 4));
    }

    static int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                return start;
            }
        }
        return start;
    }
}
