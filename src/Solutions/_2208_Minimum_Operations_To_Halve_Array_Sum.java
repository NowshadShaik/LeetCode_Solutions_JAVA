package Solutions;

import java.util.PriorityQueue;

public class _2208_Minimum_Operations_To_Halve_Array_Sum {

    public int halveArray(int[] nums) {

        int res = 0;
        double sum = 0;
        PriorityQueue<Double> pq = new PriorityQueue<Double>((a, b) -> Double.compare(b, a));

        for(int n : nums) {
            sum += n;
            pq.offer((double)n);
        }

        double temp = sum;
        while(temp > sum/2) {
            double original = pq.poll();
            double replacement = original/2;

            pq.offer(replacement);
            temp -= replacement;

            res++;
        }

        return res;
    }
}
