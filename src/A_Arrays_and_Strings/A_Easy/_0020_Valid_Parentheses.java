package A_Arrays_and_Strings.A_Easy;

import java.util.Stack;

public class _0020_Valid_Parentheses {

    class Solution {
        public boolean isValid(String s) {

            Stack<Character> stack = new Stack<>();
            for(int i=0;i<s.length();i++) {
                char curr = s.charAt(i);
                if(curr == '(' || curr == '[' || curr == '{') {
                    stack.add(curr);
                    continue;
                } else if(!stack.isEmpty()) {
                    char prev = stack.pop();
                    if((curr == ')' && prev == '(') || (curr == ']' && prev =='[') || (curr == '}' && prev =='{')) {
                        continue;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            return stack.isEmpty() ? true : false; 
        }
    }
}
