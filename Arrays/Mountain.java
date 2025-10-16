public class Mountain {
    public static void main(String[] args) {
        int[] arr = { 0,1,2,1,0};
        System.out.println(search(arr));
    }

    static int search(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else if (arr[mid] < arr[mid + 1]) {
                start = mid+1;

            } else {
                return mid;
            }
        }
        return start;
    }
}
