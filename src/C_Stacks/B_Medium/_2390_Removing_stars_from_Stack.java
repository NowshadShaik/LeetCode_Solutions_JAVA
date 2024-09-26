package C_Stacks.B_Medium;

import java.util.Stack;

public class _2390_Removing_stars_from_Stack {

    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();

        for(Character c : s.toCharArray()) {
            if(c.equals('*')) {
                if(!stack.isEmpty()) stack.pop();
            } else {
                stack.push(c);
            }
        }

        StringBuilder ans = new StringBuilder();
        for(Character c : stack) {
            ans.append(c);
        }
        return ans.toString();
    }
}
