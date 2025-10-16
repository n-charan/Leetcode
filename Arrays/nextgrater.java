public class nextgrater {
    public static void main(String[] args) {

        char[] letters = { 'c', 'h', 's', 'v' };
        char target = 'z';
        System.out.println(nextgreaterelement(letters, target));
    }

    static char nextgreaterelement(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target > letters[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return letters[start%letters.length];
    }
}
