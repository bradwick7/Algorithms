public class LC_242 {
    public static boolean isAnagram(String s, String t) {
        // Array for every lower case letter
        int[] a = new int[26];
        // We count the ocurrences of the char 'c' from string s
        // by subtracting 'a' - 'c', that gives us the index
        // Example: 'b' - 'a' = 98 - 97 = 1
        // Example: 'y' - 'a' = 121 - 97 = 24
        // The result of the subtraction is the index
        // We increment the value in the index
        for (char c : s.toCharArray()) {
            a[c - 'a']++;
        }
        // We do the same process but this time we subtract the ocurrences
        // from the second string
        for (char c : t.toCharArray()) {
            a[c - 'a']--;
        }
        // By this point, if all elements in array 'a' are 0
        // that means there was an equal amount of ocurrences
        // otherwise return false
        for (int n : a) {
            if (n != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("ccac", "ccaa"));
    }
}
