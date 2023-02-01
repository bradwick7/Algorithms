import java.util.Arrays;

public class LC_66 {

    // Optimized
    public static int[] plusOne2(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static int[] plusOne(int[] digits) {
        if (digits.length == 0)
            return new int[] {};
        int count = 0;
        int[] temp = new int[digits.length + 1];
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9 && i == digits.length - 1) {
                digits[i]++;
                return digits;
            } else if (digits[i] == 9) {
                digits[i] = 0;
                temp[i + 1] = 0;
                if (i == 0) {
                    temp[i]++;
                    return temp;
                }
                count++;
            } else if (i == digits.length - 1 - count) {
                digits[i]++;
                count = 0;
                return digits;
            }
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] digits = { 999919 };
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}
