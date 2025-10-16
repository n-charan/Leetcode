package recursion;

import java.util.ArrayList;

public class LinearsearchAll {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 4, 4, 6, 4, 8, 6 };
        search(arr, 6, 0);
        System.out.println(list);
    }

    static ArrayList<Integer> list = new ArrayList<>();

    static void search(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        search(arr, target, index + 1);
    }
}
