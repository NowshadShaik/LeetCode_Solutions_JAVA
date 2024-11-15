package Solutions;

import java.util.*;

public class _0347_Top_K_Frequent_Elements_HEAP {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
                (a, b) -> a.getValue() - b.getValue()
        );

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            minHeap.offer(entry);
            if(minHeap.size()>k) {
                minHeap.poll();
            }
        }

        int[] res = new int[k];
        int i=0;
        while(!minHeap.isEmpty()) {
            res[i++] = minHeap.poll().getKey();
        }
        return res;
    }
}
