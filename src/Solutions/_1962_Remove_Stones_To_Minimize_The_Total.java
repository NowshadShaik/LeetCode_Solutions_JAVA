package Solutions;

import java.util.PriorityQueue;

public class _1962_Remove_Stones_To_Minimize_The_Total {

    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b-a);

        long sum = 0;

        for(int n : gifts) {
            sum+=n;
            pq.offer(n);
        }

        System.out.println(sum);

        for(int i=0;i<k;i++) {
            int original = pq.poll();
            int replacement = (int) Math.floor(Math.sqrt(original));
            pq.offer(replacement);
            sum-=(original-replacement);
        }

        return sum;
    }
}
