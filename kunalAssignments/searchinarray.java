package kunalAssignments;

public class searchinarray {
    public static void main(String[] args) {
        int[] arr = { 8, 3, 4, 5, 4, 2 };
        System.out.println(search(arr, 5, 0));
        System.out.println(search1(arr, 4, arr.length - 1));
    }

    // first occurance
    static int search(int[] arr, int target, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        }
        return search(arr, target, i + 1);
    }

    // last occurance
    static int search1(int[] arr, int target, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        }
        return search(arr, target, i - 1);
    }

}
