public class rotational {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 6, 7, 0, 1, 2 };

        System.out.println(findingnumber(arr, 6));
    }

    static int findingnumber(int[] arr, int target) {
        int pivot = findpivot(arr);
        if (arr[pivot] == target) {
            return pivot;
        } else if (arr[0] > target) {
            return search(arr, target, pivot + 1, arr.length - 1);
        } else {
            return search(arr, target, 0, pivot);
        }
    }

    static int search(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int findpivot(int[] arr) {

        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (start > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
