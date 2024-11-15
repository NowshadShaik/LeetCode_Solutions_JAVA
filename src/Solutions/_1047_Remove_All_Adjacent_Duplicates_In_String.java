package Solutions;

import java.util.Stack;

public class _1047_Remove_All_Adjacent_Duplicates_In_String {

    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for (Character c : s.toCharArray()) {
            if (stack.size() > 0) {
                if (stack.peek().equals(c)) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            } else {
                stack.push(c);
            }
        }

        StringBuilder ans = new StringBuilder();
        for (Character c : stack) {
            ans.append(c);
        }
        return ans.toString();
    }
}
