package Solutions;

import java.util.ArrayDeque;
import java.util.Deque;

public class _0862_Shortest_SubArray_With_Sum_At_Least_K {

    public int shortestSubarray(int[] nums, int k) {
        int res = Integer.MAX_VALUE;
        long sum = 0;
        Deque<Pair<Long, Integer>> q = new ArrayDeque<>();

        for(int r = 0; r < nums.length; r++) {
            sum += nums[r];
            if(sum>=k)
                res = Math.min(res, r+1);

            while(!q.isEmpty() && sum - q.peekFirst().getKey() >= k) {
                Pair<Long, Integer> front = q.pollFirst();
                res = Math.min(res, r - front.getValue());
            }

            while(!q.isEmpty() && q.peekLast().getKey() > sum) {
                q.pollLast();
            }

            q.offerLast(new Pair<>(sum, r));
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
