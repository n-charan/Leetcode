import java.util.Scanner;

public class searching {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean res = search(arr, target);
        System.out.println(res ? "ELement found" : "Not Found");

    }

    static boolean search(int[] arr, int target) {

        if (arr.length == 0) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;

    }
}