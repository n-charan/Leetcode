package Arrays;

import java.util.Arrays;

public class ConcatArray1929 {
        public static void main(String[] args) {
            int[] nums = {1, 2, 1};
            System.out.println(Arrays.toString(getConcatenation(nums)));
        }

        public static int[] getConcatenation(int[] nums) {
            int n = nums.length;
            int[] ans = new int[2 * n];

            for (int i = 0; i < n; i++) {
                ans[i] = nums[i];       // first half
                ans[i + n] = nums[i];   // second half
            }

            return ans;
        }
    }
