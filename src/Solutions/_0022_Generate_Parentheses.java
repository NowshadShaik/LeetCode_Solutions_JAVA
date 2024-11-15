package Solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _0022_Generate_Parentheses {

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        Stack<Character> stack = new Stack<>();
        generate(n, 0, 0, stack, ans);
        return ans;
    }

    private void generate(int n, int open, int closed, Stack<Character> stack, List<String> res) {
        if (open == closed && open == n) {
            StringBuilder sb = new StringBuilder();
            for (Character c : stack) {
                sb.append(c);
            }
            res.add(sb.toString());
        }
        if (open < n) {
            stack.push('(');
            generate(n, open + 1, closed, stack, res);
            stack.pop();
        }
        if (closed < open) {
            stack.push(')');
            generate(n, open, closed + 1, stack, res);
            stack.pop();
        }
    }
}
