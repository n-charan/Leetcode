package SubSet;

import java.util.ArrayList;
import java.util.List;

public class Case448 {
    public static void main(String[] args) {
        System.out.println(letterCasePermutation("a1b2"));
    }
        public static List<String> letterCasePermutation(String s) {
            List<String> result = new ArrayList<>();
            backtrack(s.toCharArray(), 0, new StringBuilder(), result);
            return result;
        }

        private static  void backtrack(char[] chars, int index, StringBuilder current, List<String> result) {
            if (index == chars.length) {
                result.add(current.toString());
                return;
            }

            char c = chars[index];

            // If digit → only one option
            if (Character.isDigit(c)) {
                current.append(c);
                backtrack(chars, index + 1, current, result);
                current.deleteCharAt(current.length() - 1);
            } else {
                // Lowercase
                current.append(Character.toLowerCase(c));
                backtrack(chars, index + 1, current, result);
                current.deleteCharAt(current.length() - 1);

                // Uppercase
                current.append(Character.toUpperCase(c));
                backtrack(chars, index + 1, current, result);
                current.deleteCharAt(current.length() - 1);
            }
        }

}
