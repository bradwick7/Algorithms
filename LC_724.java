public class LC_724 {

    public static int pivotIndex(int[] nums) {
        int acumL = 0;
        int acumR = 0;
        int length = nums.length;
        int[] sumsL = new int[length];
        int[] sumsR = new int[length];
        for (int i = 0; i < length; i++) {
            acumL += nums[i];
            sumsL[i] = acumL;
            acumR += nums[length - 1 - i];
            sumsR[length - 1 - i] = acumR;
        }
        for (int i = 0; i < length; i++) {
            if (sumsL[i] == sumsR[i]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 1, -1 };
        System.out.println(pivotIndex(nums));
    }
}
