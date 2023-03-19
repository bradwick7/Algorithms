public class LC_414 {
    public static int thirdMax(int[] nums) {
        long firstMax = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;
        for (int i : nums) {
            if (i > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = i;
            } else if (firstMax > i && i > secondMax) {
                thirdMax = secondMax;
                secondMax = i;
            } else if (secondMax > i && i > thirdMax) {
                thirdMax = i;
            }
        }
        return thirdMax == Long.MIN_VALUE ? (int) firstMax : (int) thirdMax;
    }

    public static void main(String[] args) {
        int[] nums = { -2147483648, 1, 2 };
        System.out.println(thirdMax(nums));
    }
}
