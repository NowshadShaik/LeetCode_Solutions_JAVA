package Solutions;

import java.util.LinkedList;
import java.util.Queue;

public class _0225_Implement_Stack_Using_Queues {

    Queue<Integer> queue;

    public _0225_Implement_Stack_Using_Queues() {
        this.queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.offer(x);
        for (int i = 1; i < queue.size(); i++)
            queue.offer(queue.poll());
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
