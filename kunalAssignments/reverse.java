package kunalAssignments;

public class reverse {
    public static void main(String[] args) {
        char[] ch = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i' };
        System.out.println(reverseString(ch, 0, ch.length - 1));
    }

    static char[] reverseString(char[] ch, int start, int end) {
        if (start >= end) {
            return ch;
        }
        swap(ch, start, end);
        reverseString(ch, start + 1, end - 1);
        return ch;
    }

    static void swap(char[] arr, int start, int end) {
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
