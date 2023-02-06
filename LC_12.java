public class LC_12 {
    public static String intToRoman(int num) {
        String result = "";
        String[] roman = new String[] { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int[] number = new int[] { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        int i = 0;
        while (num > 0) {
            while (num >= number[i]) {
                num -= number[i];
                result += roman[i];
            }
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(1994));
    }
}
