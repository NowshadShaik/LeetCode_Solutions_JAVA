package Solutions;

import java.util.Stack;

public class _3174_Clear_Digits {

    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c) && !stack.isEmpty()) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty())
            res.append(stack.pop());

        return res.reverse().toString();
    }
}
