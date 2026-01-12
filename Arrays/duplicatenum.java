package Arrays;//287

public class duplicatenum {
    public static void main(String[] args) {
        int[] nums = {8,7,1,10,17,15,18,11,16,9,19,12,5,14,3,4,2,13,18,18};
        System.out.println(search(nums));
    }

    static int search(int[] nums) {
    
        for (int i = 0; i < nums.length; i++) {

            if(nums[i]!=i+1){
                int index = nums[i] - 1;
                if (nums[i] != nums[index]) {
                    swap(nums, i, index);
                    i=0;
                }
                else{
                    return nums[i];
                }
            }
        }
    return -1;

    }

    static void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
