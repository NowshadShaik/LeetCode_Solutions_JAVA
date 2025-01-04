package Solutions;

import java.util.Stack;

public class _0901_Online_Stock_Span {

    Stack<int[]> stack;

    public _0901_Online_Stock_Span() {
        this.stack = new Stack<>();
    }

    public int next(int price) {
        int span = 1;

        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1];
        }

        stack.push(new int[]{price, span});

        return span;
    }
}
