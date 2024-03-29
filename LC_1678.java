public class LC_1678 {
    public static String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                sb.append('G');
            } else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                sb.append('o');
            } else if (command.charAt(i) == '(' && command.charAt(i + 1) == 'a') {
                sb.append('a');
                sb.append('l');
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(interpret("G()(al)"));
    }
}
