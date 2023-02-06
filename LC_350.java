import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class LC_350 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> mapNums1 = new HashMap<>();
        HashMap<Integer, Integer> mapNums2 = new HashMap<>();
        // Count number ocurrences from the first array
        for (int i : nums1) {
            if (!mapNums1.containsKey(i)) {
                mapNums1.put(i, 1);
            } else {
                mapNums1.put(i, mapNums1.get(i) + 1);
            }
        }
        // Count number ocurrences from the second array
        for (int i : nums2) {
            if (!mapNums2.containsKey(i)) {
                mapNums2.put(i, 1);
            } else {
                mapNums2.put(i, mapNums2.get(i) + 1);
            }
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i : mapNums1.keySet()) {
            if (mapNums2.containsKey(i)) {
                int c = Math.min(mapNums1.get(i), mapNums2.get(i));
                for (int j = 0; j < c; j++) {
                    arr.add(i);
                }
            }
        }
        int[] result = new int[arr.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = arr.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = { 4, 9, 4, 5 };
        int[] nums2 = { 9, 4, 9, 8, 4 };
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }
}
