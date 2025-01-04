package Solutions;

import java.util.Stack;

public class _0071_Simplify_Path {

    public String simplifyPath(String path) {
        String[] strs = path.split("/");
        Stack<String> stack = new Stack<>();

        for (String str : strs) {
            if (str.equals("..")) {
                if (!stack.isEmpty())
                    stack.pop();
            } else {
                if (!str.equals("") && !str.equals("."))
                    stack.push(str);
            }
        }

        return "/" + String.join("/", stack);
    }
}
