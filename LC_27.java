public class LC_27 {
    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i : nums) {
            if (i != val) {
                nums[index] = i;
                index++;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 2, 2, 3 };
        System.out.println(removeElement(nums, 3));
    }
}
