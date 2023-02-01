import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LC_217 {

    public static boolean containsDuplicate2(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 != nums.length) {
                if (nums[i] == nums[i + 1]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqueNums = new HashSet<>();
        for (Integer num : nums) {
            if (!uniqueNums.add(num)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 1 };
        Arrays.sort(nums);
        System.out.println(containsDuplicate(nums));
    }
}
