package Solutions;

import java.util.PriorityQueue;

public class _3066_Minimum_Operations_To_Exceed_Threshold_Value_II {

    public int minOperations(int[] nums, int k) {
        int res = 0;

        PriorityQueue<Long> pq = new PriorityQueue<>();

        for (int n : nums) pq.offer((long) n);

        while (pq.peek() < k) {
            pq.offer((pq.poll() * 2) + pq.poll());
            res++;
        }

        return res;
    }
}
