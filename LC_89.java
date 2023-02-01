import java.util.ArrayList;
import java.util.List;

public class LC_89 {
    public static List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        result.add(0);
        if (n == 0) {
            return result;
        }
        result.add(1);
        int powerFactor = 1;
        for (int i = 2; i <= n; i++) {
            powerFactor *= 2;
            for (int j = result.size() - 1; j >= 0; j--) {
                result.add(powerFactor + result.get(j));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(grayCode(3));
    }
}
