public class LC_344 {

    public static void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char first = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = first;
        }
    }

    public static void main(String[] args) {
        char[] s = new char[] { 'A', ' ', 'm', 'a', 'n', ',', ' ', 'a', ' ', 'p', 'l', 'a', 'n', ',', ' ', 'a', ' ',
                'c', 'a', 'n', 'a', 'l', ':', ' ', 'P', 'a', 'n', 'a', 'm', 'a' };
        System.out.println(s);
        reverseString(s);
        System.out.println(s);
    }
}
