package Solutions;

import java.util.PriorityQueue;

public class _0239_Sliding_Window_Maximum {

    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] res = new int[nums.length - k + 1];

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        int l = 0;

        for (int r = 0; r < nums.length; r++) {
            pq.offer(new int[]{nums[r], r});

            if (r >= k - 1) {
                while (pq.peek()[1] <= r - k)
                    pq.poll();

                res[l++] = pq.peek()[0];
            }
        }

        return res;
    }
}
