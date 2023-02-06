import java.util.Arrays;

public class LC_1920 {
    public static int[] buildArray(int[] nums) {
        int[] array = new int[nums.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = nums[nums[i]];
        }
        return array;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 2, 1, 5, 3, 4 };
        System.out.println(Arrays.toString(buildArray(nums)));
    }
}
