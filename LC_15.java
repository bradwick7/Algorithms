import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LC_15 {

    private List<List<Integer>> listOfLists;

    public List<List<Integer>> threeSumQuick(int[] nums) {
        return new AbstractList<List<Integer>>() {
            public List<Integer> get(int index) {
                init();
                return listOfLists.get(index);
            }

            public int size() {
                init();
                return listOfLists.size();
            }

            private void init() {
                if (listOfLists != null)
                    return;
                Arrays.sort(nums);
                int j, k;
                Set<List<Integer>> set = new HashSet<>();
                for (int i = 0; i < nums.length - 2; ++i) {
                    j = i + 1;
                    k = nums.length - 1;
                    while (j < k) {
                        if (nums[i] + nums[j] + nums[k] == 0) {
                            List<Integer> t = new ArrayList<>();
                            t.add(nums[i]);
                            t.add(nums[j]);
                            t.add(nums[k]);
                            set.add(t);
                        }
                        if (nums[i] + nums[j] + nums[k] < 0)
                            ++j;
                        else
                            --k;
                    }
                }
                listOfLists = new ArrayList<List<Integer>>(set);
            }
        };
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> setOfInts = new HashSet<List<Integer>>();
        if (nums.length < 3) {
            return Collections.emptyList();
        }
        // We have to sort the array because to avoid storing duplicate lists
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; ++i) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    setOfInts.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                } else if (nums[i] + nums[j] + nums[k] < 0)
                    ++j;
                else
                    --k;
            }
        }
        return new ArrayList<>(setOfInts);
    }

    public static void main(String[] args) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        System.out.println(threeSum(nums));
    }
}
