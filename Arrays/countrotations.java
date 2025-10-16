public class countrotations {
    public static void main(String[] args) {
        int[] arr = { 15,18,20,30,40,60,12};
        System.out.println(rotation(arr));
    }

    static int rotation(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[start] < arr[mid]) {
                start = mid;
            } else if (arr[start] > arr[mid]) {
                end = mid;
            } else {
                return end;
            }
        }
        return end;
    }
}
