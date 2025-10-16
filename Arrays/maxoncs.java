package Arrays;

public class maxoncs {
    public static void main(String[] args) {
        int[] nums = { 0 };
        System.out.println(search(nums));
    }

    static int search(int[] nums) {

        int max = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }
        }

        return max;
    }

}
