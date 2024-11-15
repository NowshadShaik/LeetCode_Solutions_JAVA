package Solutions;

import java.util.Stack;

public class _2969_Minimum_String_Length_After_Removing_Substring {

    public int minLength(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (stack.size() > 0 && s.charAt(i) == 'B' && stack.peek().equals('A')) {
                stack.pop();
            } else if (stack.size() > 0 && s.charAt(i) == 'D' && stack.peek().equals('C')) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }

        return stack.size();
    }
}
