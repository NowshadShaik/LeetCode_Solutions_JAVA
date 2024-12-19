package Solutions;

import java.util.PriorityQueue;

public class _2336_Smallest_Number_In_Infinite_Set {

    int smallest;
    PriorityQueue<Integer> pq;

    public _2336_Smallest_Number_In_Infinite_Set() {
        smallest = 1;
        pq = new PriorityQueue<>();
    }

    public int popSmallest() {
        if (!pq.isEmpty())
            return pq.poll();

        smallest++;
        return smallest - 1;
    }

    public void addBack(int num) {
        if (smallest > num && !pq.contains(num))
            pq.offer(num);
    }
}
