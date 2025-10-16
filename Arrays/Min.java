public class Min {
    public static void main(String[] args) {
        int[] arr={10,3,7,-8,4,2,9};
        System.out.println(minsearch(arr));
    }

    static int minsearch(int[] arr){

        int minimum=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<minimum){
                minimum=arr[i];
            }
        }
        return minimum;
    }
}
