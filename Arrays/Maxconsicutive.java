package Arrays;//485  https://leetcode.com/problems/max-consecutive-ones/description/

public class Maxconsicutive {
    public static void main(String[] args) {
        int[] nums = { 1, 0, 1, 1, 0 ,1};
        
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] == 1) {
                    count++;

                } else if (nums[j] == 0) {

                    break;
                }
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }

}
