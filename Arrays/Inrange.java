public class Inrange {
    public static void main(String[] args) {
        
        int[ ] arr={10,5,2,4,8,1};
        int target=8;
        System.out.println(search(arr, target,2,5));
    }

    static int search(int[] arr, int target,int start,int end){

        for(int i = start; i < end; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}
