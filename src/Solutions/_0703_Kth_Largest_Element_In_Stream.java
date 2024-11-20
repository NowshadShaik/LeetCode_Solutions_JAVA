package Solutions;

import java.util.PriorityQueue;

public class _0703_Kth_Largest_Element_In_Stream {

    private int k;
    private PriorityQueue<Integer> minHeap;

    public _0703_Kth_Largest_Element_In_Stream(int k, int[] nums) {
        this.k = k;
        minHeap = new PriorityQueue<>();

        for (int n : nums) add(n);
    }

    public int add(int val) {
        minHeap.offer(val);
        while (minHeap.size() > k) {
            minHeap.poll();
        }

        return minHeap.peek();
    }

}
