import java.util.ArrayList;
import java.util.List;

public class LC_2194 {
    public static List<String> cellsInRange(String s) {
        List<String> result = new ArrayList<>();
        char startLetter = s.charAt(0);
        char endLetter = s.charAt(3);
        char startNumber = s.charAt(1);
        char endNumber = s.charAt(4);
        int columns = endLetter - startLetter;
        for (int i = 0; i <= columns; i++) {
            for (int j = startNumber; j <= endNumber; j++) {
                String aux = "";
                aux += startLetter;
                aux += j - 48;
                result.add(aux);
            }
            startLetter++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(cellsInRange("U7:X9")); // U7:X9, K1:L2
    }
}
