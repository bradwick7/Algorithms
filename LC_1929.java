import java.util.Arrays;

public class LC_1929 {
    public static int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];
        int length = nums.length;
        for (int i = 0; i < result.length; i++) {
            if (length == nums.length) {
                length = 0;
            }
            result[i] = nums[length++];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 2, 1, 5 };
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
}
