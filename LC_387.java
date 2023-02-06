public class LC_387 {
    public static int firstUniqChar(String s) {
        int[] charArray = new int[26];
        // Count char ocurrences
        for (char c : s.toCharArray()) {
            charArray[c - 'a']++;
        }
        // Return index of unique char
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (charArray[c - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode")); // output: 0
        System.out.println(firstUniqChar("loveleetcode")); // output: 2
        System.out.println(firstUniqChar("aabb")); // output: -1
    }
}
