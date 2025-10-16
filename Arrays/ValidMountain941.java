package Arrays;
//941--valid mountain
public class ValidMountain941 {
    public static void main(String[] args) {
        int []  nums={0,1,2,4,2,1};
        System.out.println(validMountain(nums));
    }
    public static boolean validMountain(int[] nums) {

        if (nums.length > 2) {
            int peak1 = 0;

            int peak2 = 0;

            for (int i = 0; i < nums.length - 1; i++) {

                if (nums[i] < nums[i + 1]) {
                    peak1 = i + 1;
                }
                else if (peak1 == 0 || peak1 == nums.length - 1) {
                    return false;
                }else {
                    break;
                }
            }
            for (int i = nums.length - 1; i > 0; i--) {

                if (nums[i] < nums[i - 1]) {
                    peak2 = i - 1;
                } else if (peak2 == 0 || peak2 == nums.length - 1) {
                    return false;
                } else {
                    break;
                }
            }
            if (peak1 == peak2) {
                return true;
            }
            return false;
        }
            return false;

    }
}
