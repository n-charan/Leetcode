package kunalAssignments;

public class Unique {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 1,3, 2, 4, 1 };
        System.out.println(ans(arr));
    }

    static int ans(int[] arr) {
        int unique = 0;
        for (int i = 0; i < arr.length; i++) {
            unique = unique ^ arr[i];

        }
        return unique;
    }
}
