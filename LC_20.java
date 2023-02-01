import java.util.Stack;

public class LC_20 {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        if (s.length() % 2 != 0) {
            return false;
        }
        for (Character c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (!stack.isEmpty()) {
                if (c == ')' && stack.peek() == '(' && !stack.isEmpty()) {
                    stack.pop();
                } else if (c == ']' && stack.peek() == '[' && !stack.isEmpty()) {
                    stack.pop();
                } else if (c == '}' && stack.peek() == '{' && !stack.isEmpty()) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "}(";
        System.out.println(isValid(s));
    }
}
