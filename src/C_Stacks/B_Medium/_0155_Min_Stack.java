package C_Stacks.B_Medium;

import java.util.Stack;

public class _0155_Min_Stack {
    class MinStack {
        private Stack<Integer> minStack;
        private Stack<Integer> min;

        public MinStack() {
            minStack = new Stack<>();
            min = new Stack<>();
        }

        public void push(int val) {
            minStack.push(val);
            if (!min.isEmpty())
                min.push(Math.min(min.peek(), val));
            else
                min.push(val);
        }

        public void pop() {
            minStack.pop();
            min.pop();
        }

        public int top() {
            return minStack.peek();
        }

        public int getMin() {
            return min.peek();
        }
    }
}
