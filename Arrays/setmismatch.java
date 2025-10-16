package Arrays;

import java.util.Arrays;

public interface setmismatch {
    public static void main(String[] args) {
        int [] nums={2,3,2};
        int[] res=findErrorNums(nums);
        System.out.println(Arrays.toString(res));
    }
    static int[] findErrorNums(int[] nums){
        for(int i=0; i<nums.length;){
            int index=nums[i]-1;
            if(nums[i]!=nums[index]){
                swap(nums,i,index);
                
            }else{
                i++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1){
                return new int[]{nums[i],i+1};
            }
        }
        return new int[]{-1,-1};
    }
    static void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
