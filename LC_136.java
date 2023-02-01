import java.util.HashMap;

public class LC_136 {
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }
        int n = 0;
        for (int i : map.keySet()) {
            if (map.get(i).equals(1)) {
                n = i;
            }
        }
        return n;
    }

    public static int singleNumberQuick(int[] nums) {
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            n = n ^ nums[i]; // Bitwise XOR operator
        }
        return n;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 4, 1, 2, 1, 2 };
        System.out.println(singleNumberQuick(nums));
    }
}
