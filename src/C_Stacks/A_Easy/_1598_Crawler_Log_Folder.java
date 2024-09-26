package C_Stacks.A_Easy;

import java.util.Stack;

public class _1598_Crawler_Log_Folder {

    class Solution {
        public int minOperations(String[] logs) {
            Stack<Integer> stack = new Stack<>();

            for (String s : logs) {
                if (s.equals("../")) {
                    if (stack.size() > 0)
                        stack.pop();
                } else if (s.equals("./")) {

                } else {
                    stack.push(1);
                }
            }

            return stack.size();
        }
    }
}