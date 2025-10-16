import java.util.Scanner;

public class SearchArray {

    // brute force
    /*
     * public static int[] searchIndexes(int[] arr, int start, int end, int target)
     * {
     * int[] res = new int[2];
     * 
     * int p, q;
     * p = q = 0;
     * int mid = (start + end) / 2;
     * 
     * if (target <= arr[mid]) {
     * if (target == arr[mid] && q == 0) {
     * q = mid;
     * }
     * 
     * for (int i = 0; i <= mid; i++) {
     * if (arr[i] == target) {
     * p = i;
     * break;
     * }
     * }
     * }
     * 
     * if (target == arr[mid + 1]) {
     * for (int i = mid + 1; i < end; i++) {
     * if (target == arr[i]) {
     * q = i;
     * }
     * }
     * }
     * 
     * res[0] = p;
     * res[1] = q;
     * return res;
     * }
     */

    public static int[] findIndexes(int[] arr, int start, int end, int target) {
        int[] res = new int[2];

        int p = 0;
        int q = 0;
        int mid = 0;
        while (start < end) {
            mid = (start + end) / 2;

            if (target <= arr[mid]) {
                if (target == arr[mid] && q == 0) {
                    q = mid;
                }

                end = mid - 1;
            } else {
                start = mid + 1;
            }

            if ((start == end) && (p == 0)) {
                p = start;
                start = q;
                end = arr.length - 1;
            }
        }

        q = start;
        res[0] = p;
        res[1] = q;
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target value:");
        int target = sc.nextInt();

        int[] res = findIndexes(arr, 0, n - 1, target);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
