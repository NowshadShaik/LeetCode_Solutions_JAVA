package Solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class _3318_Find_X_Sum_of_All_K_Long_Subarrays_I {

    public int[] findXSum(int[] nums, int k, int x) {
        int r = nums.length - k+1;
        int[] res = new int[r];

        for(int i=0;i<r;i++) {
            res[i] = xSum(nums, i, i+k, x);
        }

        return res;
    }

    private int xSum(int[] nums, int l, int r, int x) {

        Map<Integer, Integer> freq = new HashMap<>();

        for(int i=l; i<r; i++)
            freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1 );

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] == b[1] ? a[0]-b[0] : a[1]-b[1]);

        for(Map.Entry<Integer, Integer> entry: freq.entrySet()) {
            pq.offer(new int[] {entry.getKey(), entry.getValue()});
            if(pq.size() > x)
                pq.poll();
        }

        int xSum = 0;
        while(!pq.isEmpty()) {
            int[] entry = pq.poll();
            xSum += entry[0] * entry[1];
        }

        return xSum;
    }
}
