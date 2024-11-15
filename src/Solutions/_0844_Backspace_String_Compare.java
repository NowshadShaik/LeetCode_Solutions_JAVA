package Solutions;

import java.util.Stack;

public class _0844_Backspace_String_Compare {

    public boolean backspaceCompare(String s, String t) {

        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for (Character c : s.toCharArray()) {
            if (c.equals('#')) {
                if (!stack1.isEmpty())
                    stack1.pop();
            } else {
                stack1.push(c);
            }
        }
        System.out.println(stack1);

        for (Character c : t.toCharArray()) {
            if (c.equals('#')) {
                if (!stack2.isEmpty())
                    stack2.pop();
            } else {
                stack2.push(c);
            }
        }
        System.out.println(stack2);

        if (stack1.size() == stack2.size()) {
            for (int i = 0; i < stack1.size(); i++) {
                if (stack1.get(i) != stack2.get(i)) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }
}
