
public class RotationalBinarySearch {

    public static int[] getStartEndIndexes(int[] arr, int target) {
        int[] ind = new int[2];

        int start1 = 0;
        int end1 = 0;
        int start2 = 0;
        int end2 = arr.length - 1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                end1 = i;
                start2 = i + 1;
                break;
            }
        }

        if (target < arr[start1]) {
            ind[0] = start2;
            ind[1] = end2;
        } else {
            ind[0] = start1;
            ind[1] = end1;
        }

        return ind;
    }

    public static int binarySearch(int[] arr, int target) {
        int[] ind = getStartEndIndexes(arr, target);

        int start = ind[0];
        int end = ind[1];

        while (start < end) {
            int mid = (start + end) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 6, 7, 1, 2 };
        System.out.println(binarySearch(arr, 5));
    }
}