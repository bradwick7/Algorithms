import java.util.Arrays;

public class LC_88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = nums1.length - 1;
        m--;
        n--;

        while (index >= 0 && m != -1 || n != -1) {
            if (m < 0) {
                nums1[index] = nums2[n];
                n--;
            } else if (n < 0) {
                nums1[index] = nums1[m];
                m--;
            } else if (nums1[m] > nums2[n]) {
                nums1[index] = nums1[m];
                m--;
            } else {
                nums1[index] = nums2[n];
                n--;
            }
            index--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = { 2, 0 };
        int[] nums2 = { 1 };
        int m = 1;
        int n = 1;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }
}
