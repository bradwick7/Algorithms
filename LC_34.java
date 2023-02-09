import java.util.Arrays;

public class LC_34 {
    public static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target && counter == 0) {
                result[counter] = i;
                counter++;
            } else if (nums[i] == target) {
                result[1] = i;
            }
        }
        if (counter == 0) {
            result[0] = -1;
            result[1] = -1;
        } else if (counter == 1 && result[1] == 0) {
            result[1] = result[0];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 4 };
        System.out.println(Arrays.toString(searchRange(nums, 4)));
    }
}
