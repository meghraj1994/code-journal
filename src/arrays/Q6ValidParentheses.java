package arrays;

import java.util.Stack;

public class Q6ValidParentheses {

    public static void main(String[] args) {
        String s1 = "()"; // true
        String s2 = "()[]{}"; //true
        String s3 = "[)"; // false

        System.out.println(valid(s1));
        System.out.println(valid(s2));
        System.out.println(valid(s3));
    }

    public static boolean valid(String s) {

        Stack<Character> stack = new Stack<>();
        for (Character ch : s.toCharArray()) {
            if (ch == '[' || ch == '{' || ch == '(') {
                stack.push(ch);
            } else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();

            } else if (ch == ')' && !stack.isEmpty() && stack.peek()=='(') {
                stack.pop();

            } else if (ch=='}' && !stack.isEmpty() && stack.peek()=='{') {
                stack.pop();

            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
