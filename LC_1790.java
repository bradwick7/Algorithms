public class LC_1790 {
    public static boolean areAlmostEqual(String s1, String s2) {
        // Check if both strings are equal
        if (s1.equals(s2))
            return true;
        // Check if both strings have the same characters
        int[] chars = new int[26];
        for (char c : s1.toCharArray()) {
            chars[c - 'a']++;
        }
        for (char c : s2.toCharArray()) {
            chars[c - 'a']--;
        }
        for (int i : chars) {
            if (i >= 1) {
                return false;
            }
        }
        // Counter increments every time a char of 's1'matches a char of 's2'
        int counter = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                counter++;
            }
        }
        return (s1.length() - 2 == counter);
    }

    public static void main(String[] args) {
        System.out.println(areAlmostEqual("aa", "bb"));
    }
}
