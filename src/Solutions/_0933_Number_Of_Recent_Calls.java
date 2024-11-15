package Solutions;

import java.util.LinkedList;
import java.util.Queue;

public class _0933_Number_Of_Recent_Calls {
    Queue<Integer> queue;

    public _0933_Number_Of_Recent_Calls() {
        this.queue = new LinkedList<>();
    }

    public int ping(int t) {
        while(!queue.isEmpty() && queue.peek()< t-3000) queue.poll();
        queue.add(t);
        return queue.size();
    }
}