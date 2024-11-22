package Solutions;

public class _1381_Design_A_Stack_With_Increment_Operation {
    int[] stack;
    int top;

    public _1381_Design_A_Stack_With_Increment_Operation(int maxSize) {
        this.stack = new int[maxSize];
        this.top = -1;
    }

    public void push(int x) {
        if(top+1 < stack.length) {
            top++;
            stack[top] = x;
        }
    }

    public int pop() {
        if(top >=0) {
            return stack[top--];
        }
        return top;
    }

    public void increment(int k, int val) {
        int r = Math.min(top+1, k);

        for(int i=0;i<r;i++) {
            stack[i] += val;
        }
    }
}
