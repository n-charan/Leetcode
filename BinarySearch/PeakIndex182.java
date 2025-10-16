package BinarySearch;

public class PeakIndex182 {
    public static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            } else {

                end = mid;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,6,8,4,3};
        int peak = findPeakElement(nums);
        System.out.println(peak);
    }
}


