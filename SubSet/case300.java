package SubSet;

public class case300 {
    public static void main(String[] args) {
        int [] nums={0,1,0,3,2,3};
        System.out.println(londsubseqarray(nums,0,1,1));
    }
    static int londsubseqarray(int [] nums,int index,int count,int innercount){
        for (int i=index;i<nums.length;i++){
            int len=nums[i];
            for (int j=i;j<nums.length;j++){
                if(len<nums[j]){
                    len=nums[j];
                    innercount++;
                }
                if(innercount>count){
                    count=innercount;
                }
            }
        }
        return count;
    }
}
