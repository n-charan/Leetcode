public class infinite {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 6, 14, 16, 23, 34, 56, 67, 78, 89, 456 };
        int target = 67;
        System.out.println(ans(arr, target));
    }

    static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;

        int index = 0;

        try {
            while (true) {
                arr[index] = arr[index];
                index++;
            }
        } catch (Exception e) {
            end = index;
        }

        System.out.println("End index:" + end);

        // while (target > arr[end]) {
        // int newstart = end + 1;
        // end = end + (end - start + 1) * 2;
        // start = newstart;
        // }
        return infi(arr, target, start, end);
    }

    static int infi(int[] arr, int target, int start, int end) {

        while (start < end) {
            int mid = (start + end) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
