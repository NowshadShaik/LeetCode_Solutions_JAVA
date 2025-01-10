package Solutions;

import java.util.PriorityQueue;

public class _0502_IPO {

    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {

        PriorityQueue<int[]> minCapital = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for (int i = 0; i < profits.length; i++)
            minCapital.offer(new int[]{capital[i], profits[i]});

        PriorityQueue<Integer> maxProfit = new PriorityQueue<>((a, b) -> b - a);

        while (k > 0) {
            while (!minCapital.isEmpty() && minCapital.peek()[0] <= w)
                maxProfit.offer(minCapital.poll()[1]);

            if (maxProfit.isEmpty())
                break;

            w += maxProfit.poll();
            k--;
        }

        return w;
    }
}
