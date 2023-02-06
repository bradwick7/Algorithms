import java.util.Arrays;

public class LC_1470 {
    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int x = 0;
        int y = nums.length / 2;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                result[i] = nums[x];
                x++;
            } else {
                result[i] = nums[y];
                y++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 2, 2 };
        System.out.println(Arrays.toString(shuffle(nums, 2)));
    }
}
