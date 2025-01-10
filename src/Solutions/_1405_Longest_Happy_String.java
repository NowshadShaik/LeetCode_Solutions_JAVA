package Solutions;

import java.util.PriorityQueue;

public class _1405_Longest_Happy_String {

    public String longestDiverseString(int a, int b, int c) {
        StringBuilder res = new StringBuilder();

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((x, y) -> y[1] - x[1]);
        if (a > 0) maxHeap.offer(new int[]{'a', a});
        if (b > 0) maxHeap.offer(new int[]{'b', b});
        if (c > 0) maxHeap.offer(new int[]{'c', c});

        while (!maxHeap.isEmpty()) {
            int[] curr = maxHeap.poll();

            if (res.length() > 1) {
                if (curr[0] == res.charAt(res.length() - 1) && curr[0] == res.charAt(res.length() - 2)) {
                    if (maxHeap.isEmpty())
                        return res.toString();
                    else {
                        int[] prev = curr;
                        curr = maxHeap.poll();
                        maxHeap.offer(prev);
                    }
                }
            }

            res.append((char) curr[0]);
            if (curr[1] > 1) {
                maxHeap.offer(new int[]{curr[0], curr[1] - 1});
            }
        }

        return res.toString();
    }
}
