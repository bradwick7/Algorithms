public class LC_11 {

    public static int maxArea(int[] height) {
        int water = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            water = Math.max(water, Math.min(height[left], height[right]) * (right - left));
            if (height[left] < height[right]) {
                left++;
            } else if (height[right] < height[left]) {
                right--;
            } else {
                left++;
                right--;
            }
        }
        return water;
    }

    public static void main(String[] args) {
        int[] height = { 1, 2, 4, 3 };
        System.out.println(maxArea(height));
    }
}
