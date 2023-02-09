import java.util.ArrayList;
import java.util.List;

public class LC_1431 {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        // Get greatest number of candies
        int max = 0;
        for (int i : candies) {
            max = Math.max(max, i);
        }
        System.out.println("Kid with most candies: " + max);
        // Give extra candies to every kid
        for (int i : candies) {
            list.add(i + extraCandies >= max);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] candies = { 2, 3, 5, 1, 3 };
        System.out.println(kidsWithCandies(candies, 3));
    }
}
