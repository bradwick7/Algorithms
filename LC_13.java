public class LC_13 {

    public static int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char d = ' ';
            if (i + 1 <= s.length() - 1) {
                d = s.charAt(i + 1);
            }
            switch (c) {
                case 'I':
                    if (d == 'V') {
                        sum += 4;
                        i += 1;
                    } else if (d == 'X') {
                        sum += 9;
                        i += 1;
                    } else {
                        sum += 1;
                    }
                    break;
                case 'V':
                    sum += 5;
                    break;
                case 'X':
                    if (d == 'L') {
                        sum += 40;
                        i += 1;
                    } else if (d == 'C') {
                        sum += 90;
                        i += 1;
                    } else {
                        sum += 10;
                    }
                    break;
                case 'L':
                    sum += 50;
                    break;
                case 'C':
                    if (d == 'D') {
                        sum += 400;
                        i += 1;
                    } else if (d == 'M') {
                        sum += 900;
                        i += 1;
                    } else {
                        sum += 100;
                    }
                    break;
                case 'D':
                    sum += 500;
                    break;
                case 'M':
                    sum += 1000;
                    break;
                default:
                    break;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MMMMCMXCIX"));
    }
}
