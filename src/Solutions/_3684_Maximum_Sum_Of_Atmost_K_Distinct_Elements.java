package Solutions;

import java.util.PriorityQueue;

public class _3684_Maximum_Sum_Of_Atmost_K_Distinct_Elements {

    public int[] maxKDistinct(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int n : nums) {
            if (!minHeap.contains(n))
                minHeap.offer(n);

            if (minHeap.size() > k)
                minHeap.poll();
        }

        int[] res = new int[minHeap.size()];
        int r = res.length - 1;
        while (!minHeap.isEmpty())
            res[r--] = minHeap.poll();

        return res;
    }
}
