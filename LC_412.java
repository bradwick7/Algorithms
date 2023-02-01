import java.util.ArrayList;
import java.util.List;

public class LC_412 {
    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add(i - 1, "FizzBuzz");
            } else if (i % 3 == 0) {
                list.add(i - 1, "Fizz");
            } else if (i % 5 == 0) {
                list.add(i - 1, "Buzz");
            } else {
                list.add(i - 1, i + "");
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(90));
    }
}
