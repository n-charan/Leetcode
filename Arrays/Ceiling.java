public class Ceiling {
    public static void main(String[] args) {

        int[] arr = { 2, 5, 6, 8, 12, 16, 18, 20 };
        int target = 17;
        System.out.println(ceiling(arr, target));
    }

    static int ceiling(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        while (start < end) {

            int mid = (start + end) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] == target) {
                return arr[mid + 1];
            }
        }
        return arr[start];

    }
}
