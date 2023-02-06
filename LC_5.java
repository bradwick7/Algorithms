import java.util.HashSet;
import java.util.Set;

public class LC_5 {
    public static String longestPalindromeQuick(String s) {
        if (s == null || s.length() < 1)
            return "";
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            int expand1 = expandFromCenter(s, i, i);
            int expand2 = expandFromCenter(s, i, i + 1);
            int expand = Math.max(expand1, expand2);
            if (expand > end - start) {
                start = i - ((expand - 1) / 2);
                end = i + (expand / 2);
            }
        }
        return s.substring(start, end + 1);
    }

    public static int expandFromCenter(String s, int left, int right) {
        if (s == null || left > right)
            return 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }

    public static String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }
        Set<String> palindromes = new HashSet<>();
        // Print every possible string formation
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String temp = s.substring(i, j);
                if (!palindromes.contains(temp) && isPalindrome(temp)) {
                    palindromes.add(temp);
                }
            }
        }
        String longestPalindrome = "";
        for (String string : palindromes) {
            if (string.length() >= longestPalindrome.length()) {
                longestPalindrome = string;
            }
        }

        return longestPalindrome;
    }

    public static boolean isPalindrome(String s) {
        String ns = "";
        for (int i = 0; i < s.length(); i++) {
            ns = s.charAt(i) + ns;
        }
        return ns.equals(s);
    }

    public static void main(String[] args) {
        String s = "abbcsre";
        System.out.println(longestPalindromeQuick(s));
    }
}
