public class LC_283 {
    public static void moveZeroes(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                counter++;
            } else {
                int temp = nums[i - counter];
                nums[i - counter] = nums[i];
                nums[i] = temp;
            }
        }

        for (int j : nums) {
            System.out.println(j);
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1 };
        moveZeroes(nums);
    }
}
