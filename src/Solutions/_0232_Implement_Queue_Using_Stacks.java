package Solutions;

import java.util.Stack;

public class _0232_Implement_Queue_Using_Stacks {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public _0232_Implement_Queue_Using_Stacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        while (stack1.size() > 1)
            stack2.push(stack1.pop());

        int res = stack1.pop();
        while (stack2.size() > 0)
            stack1.push(stack2.pop());

        return res;
    }

    public int peek() {
        while (stack1.size() > 1)
            stack2.push(stack1.pop());

        int res = stack1.peek();
        while (stack2.size() > 0)
            stack1.push(stack2.pop());

        return res;
    }

    public boolean empty() {
        return stack1.isEmpty();
    }
}
