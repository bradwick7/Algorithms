public class LC_125 {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        String ns = "";
        for (int i = 0; i < s.length(); i++) {
            ns = s.charAt(i) + ns;
        }
        return ns.equals(s);
    }

    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(isPalindrome(s));
    }
}
