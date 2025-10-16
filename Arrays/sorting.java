public class sorting {
    public static void main(String[] args) {
        int arr[]={5,6,3,9,10,2,4};
        for(int i=0; i<arr.length;i++){
            int res=sort(arr);
            System.out.println(arr[i]);
        }
    }
    static int sort(int[] arr){

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length-1; j++){

                if(arr[i]>arr[j+1]){
                    int temp=arr[i];
                    arr[i] = arr[j+1];
                    arr[j+1] = temp;
                    return arr[i]+" "+arr[j];
                    

                }
            }
            return arr[i];
        }
        return 0;
        

    }
}
// public class sorting {
//     public static void main(String[] args) {
//         int[] arr = {64, 25, 12, 22, 11};
        
//         // Selection sort implementation
//         for (int i = 0; i < arr.length - 1; i++) {
//             int minIndex = i;
            
//             // Find the minimum element in the unsorted part of the array
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[j] < arr[minIndex]) {
//                     minIndex = j;
//                 }
//             }
            
//             // Swap the found minimum element with the element at the current index
//             if (minIndex != i) {
//                 int temp = arr[minIndex];
//                 arr[minIndex] = arr[i];
//                 arr[i] = temp;
//             }
//         }
        
//         // Print the sorted array
//         System.out.print("Sorted array: ");
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

