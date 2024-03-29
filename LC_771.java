public class LC_771 {
    public static int numJewelsInStones(String jewels, String stones) {
        int counter = 0;
        for (int i = 0; i < stones.length(); i++) {
            for (int j = 0; j < jewels.length(); j++) {
                if (stones.charAt(i) == jewels.charAt(j)) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static int numJewelsInStonesQuick(String jewels, String stones) {
        int counter = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.indexOf(stones.charAt(i)) != -1) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStonesQuick("aA", "aAAZvesf"));
    }
}
