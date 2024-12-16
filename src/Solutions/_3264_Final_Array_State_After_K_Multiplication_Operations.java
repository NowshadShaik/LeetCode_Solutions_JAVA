package Solutions;

import java.util.PriorityQueue;

public class _3264_Final_Array_State_After_K_Multiplication_Operations {

    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

        for (int i = 0; i < nums.length; i++) {
            pq.offer(new int[]{nums[i], i});
        }

        while (k-- > 0) {
            int[] curr = pq.poll();
            int index = curr[1];

            nums[index] *= multiplier;
            pq.offer(new int[]{nums[index], index});
        }

        return nums;
    }

}
