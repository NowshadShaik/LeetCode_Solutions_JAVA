package Solutions;

import java.util.PriorityQueue;

public class _1046_Last_Stone_Weight {

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int s : stones) minHeap.offer(-s);

        while(minHeap.size() > 1) {
            int a = minHeap.poll();
            int b = minHeap.poll();
            if(b>a) minHeap.offer(a-b);
        }

        minHeap.offer(0);
        return Math.abs(minHeap.peek());
    }
}
