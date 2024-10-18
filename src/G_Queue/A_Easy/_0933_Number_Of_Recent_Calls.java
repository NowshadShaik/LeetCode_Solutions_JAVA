package G_Queue.A_Easy;

import java.util.LinkedList;
import java.util.Queue;

public class _0933_Number_Of_Recent_Calls {

}
class RecentCounter {
    Queue<Integer> queue;

    public RecentCounter() {
        this.queue = new LinkedList<>();
    }

    public int ping(int t) {
        while(!queue.isEmpty() && queue.peek()< t-3000) queue.poll();
        queue.add(t);
        return queue.size();
    }
}