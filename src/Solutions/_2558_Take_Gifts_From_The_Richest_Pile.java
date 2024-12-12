package Solutions;

import java.util.PriorityQueue;

public class _2558_Take_Gifts_From_The_Richest_Pile {

    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b-a);

        long sum = 0;

        for(int n : gifts) {
            sum+=n;
            pq.offer(n);
        }

        for(int i=0;i<k;i++) {
            int original = pq.poll();
            int replacement = (int) Math.floor(Math.sqrt(original));
            pq.offer(replacement);
            sum-=(original-replacement);
        }

        return sum;
    }
}
