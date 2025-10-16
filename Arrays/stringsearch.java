import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class stringsearch {
    public static boolean searchCharacter() {

        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        String line = b.readLine(); // hello
        char[] arr = line.toCharArray(); // {'h','e','l','l','o'}
        int flag = 0;

        char target = b.readLine().charAt(0);

        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                flag = 1;
                System.out.println("found");
            }
        }
        if (flag == 0) {
            System.out.println("Not found");
        }
    }
}
