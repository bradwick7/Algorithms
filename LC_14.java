import java.util.Arrays;

public class LC_14 {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs == null) {
            return "";
        }
        Arrays.sort(strs);
        String result = "";
        String str1 = strs[0];
        String str2 = strs[strs.length - 1];
        for (int i = 0; i < str1.length() && i < str2.length(); i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                result += str1.charAt(i);
            } else {
                return result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] strs = { "dog", "racecar", "car" };
        System.out.println(longestCommonPrefix(strs));
    }
}
