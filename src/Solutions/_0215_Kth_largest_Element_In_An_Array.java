package Solutions;

import java.util.PriorityQueue;

public class _0215_Kth_largest_Element_In_An_Array {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int n: nums) {
            minHeap.offer(n);
            if(minHeap.size() > k) minHeap.poll();
        }

        return minHeap.peek();
    }
}
