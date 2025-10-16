public class Evendigits {
    public static void main(String[] args) {
        int [] arr={14,3,5678,213,23};
        System.out.println(counting(arr));
    }

    static int counting(int[] arr){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(even(arr[i])){
                count++;
            }
        }
        return count;
    }
    static boolean even(int arr){
        if(countdigits(arr)%2!=0){
            return true;
        }
        return false;
    }
    static int countdigits(int arr){
        int count = 0;
        while (arr>0){
            count++;
            arr=arr/10;
        }
        return count;
    }
}
