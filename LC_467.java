public class LC_467 {

    private static int currentIndex = 0;
    private static char[] alphabet = new char[] {
            'a', 'b', 'c', 'd', 'e', 'f', 'g',
            'h', 'i', 'j', 'k', 'l', 'm', 'n',
            'o', 'p', 'q', 'r', 's', 't', 'u',
            'v', 'w', 'x', 'y', 'z' };

    public static char nextLetter() {
        currentIndex = (currentIndex + 1) % alphabet.length;
        char letter = alphabet[currentIndex];
        return letter;
    }

    public static int findSubstringInWraproundString(String p) {
        int[] alphabet = new int[26];
        char[] letters = p.toCharArray();
        // Find substrings with length equal to 1
        for (char c : letters) {
            alphabet[c - 'a']++;
        }
        // Count substrings with length equal to 1
        int counter = 0;
        for (int i : alphabet) {
            if (i != 0) {
                counter++;
            }
        }
        // Find substrings with length greater than 1
        for (int i = 0; i <= p.length(); i++) {
            for (int j = i + 1; j <= p.length(); j++) {
                String str = p.substring(i, j);
                if (str.length() > 1) {
                    boolean check = true;
                    for (int k = 0; k < str.length() - 1; k++) {
                        currentIndex = str.charAt(k) - 'a';
                        if (str.charAt(k + 1) != nextLetter()) {
                            check = false;
                        }
                    }
                    if (check) {
                        counter++;
                    }
                }
            }
        }
        return counter;
    }

    // public char nextLetter() {
    // char letter = alphabet.get(currentIndex);
    // currentIndex = (currentIndex + 1) % alphabet.size();
    // return letter;
    // }

    public static void main(String[] args) {
        System.out.println(findSubstringInWraproundString("zaba"));
    }
}
