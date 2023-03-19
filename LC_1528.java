public class LC_1528 {
    public static String restoreString(String s, int[] indices) {
        char[] result = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            result[indices[i]] = s.charAt(i);
        }
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };
        System.out.println(restoreString("codeleet", indices));
    }
}
