public class LC_2011 {
    public static int finalValueAfterOperations(String[] operations) {
        int sum = 0;
        for (String operation : operations) {
            switch (operation) {
                case "--X":
                    sum--;
                    break;
                case "X--":
                    sum--;
                    break;
                case "++X":
                    sum++;
                    break;
                case "X++":
                    sum++;
                    break;

                default:
                    break;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String[] strs = { "--X", "X++", "X++" };
        System.out.println(finalValueAfterOperations(strs));
    }
}
