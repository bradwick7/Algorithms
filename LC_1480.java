import java.util.Arrays;

public class LC_1480 {

    public static int[] runningSum(int[] nums) {
        int aux = 0;
        int[] sum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            aux += nums[i];
            sum[i] = aux;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(runningSum(nums)));
    }
}
