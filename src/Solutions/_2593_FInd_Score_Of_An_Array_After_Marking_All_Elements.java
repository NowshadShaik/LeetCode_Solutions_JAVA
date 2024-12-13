package Solutions;

import java.util.PriorityQueue;

public class _2593_FInd_Score_Of_An_Array_After_Marking_All_Elements {

    public long findScore(int[] nums) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0]) return a[0] - b[0];
            else return a[1] - b[1];
        });
        boolean[] marked = new boolean[nums.length];

        for (int i = 0; i < nums.length; i++) {
            pq.add(new int[]{nums[i], i});
        }

        long sum = 0;
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();

            int i = curr[1];
            if (marked[i] == true) continue;
            sum += curr[0];

            if (i - 1 >= 0) {
                marked[i - 1] = true;
            }
            if (i + 1 <= nums.length - 1) {
                marked[i + 1] = true;
            }
            marked[i] = true;
        }

        return sum;
    }
}
