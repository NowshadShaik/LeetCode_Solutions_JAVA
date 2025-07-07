package Solutions;

import java.util.Arrays;
import java.util.PriorityQueue;

public class _1353_Maximum_Number_of_Events_That_Can_Be_Attended {

    public int maxEvents(int[][] events) {
        int n = events.length;
        int res = 0;

        Arrays.sort(events, (a, b) -> a[0] - b[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int maxDay = 0;
        for (int[] event : events)
            maxDay = Math.max(event[1], maxDay);

        for (int i = 1, j = 0; i <= maxDay; i++) {
            while (j < n && events[j][0] <= i) {
                pq.offer(events[j][1]);
                j++;
            }

            while (!pq.isEmpty() && pq.peek() < i)
                pq.poll();

            if (!pq.isEmpty()) {
                pq.poll();
                res++;
            }
        }

        return res;
    }
}
