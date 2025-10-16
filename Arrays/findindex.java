public class findindex {
    public static void main(String[] args) {
        int[] arr={22,3,2,4,3,2,6,2,23,2 ,};
        find(arr,3);
    }
    static void find(int[] arr,int target){
        int leastindex=0;
        int highestindex=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                leastindex=i;
                break;
            }
        }
        for(int i=arr.length-1;i<=arr.length-1;i--){
            if(arr[i]==target){
                highestindex=i;
                break;
            }
        }
        System.out.println(leastindex);
        System.out.println(highestindex);
    }
}
