import java.util.Arrays;

public class LC_1 {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }

    public static int[] twoSum_v2(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int b = target - nums[i];
            System.out.println(b);
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == b) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 5, 5, 11 };
        int target = 10;
        System.out.println(Arrays.toString(twoSum_v2(nums, target)));
    }
}
