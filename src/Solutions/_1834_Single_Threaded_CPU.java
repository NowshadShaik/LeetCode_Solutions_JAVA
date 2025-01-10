package Solutions;

import java.util.PriorityQueue;

public class _1834_Single_Threaded_CPU {

    public int[] getOrder(int[][] tasks) {

        PriorityQueue<int[]> tasksMinHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        for (int i = 0; i < tasks.length; i++) {
            tasksMinHeap.offer(new int[]{tasks[i][0], tasks[i][1], i});
        }

        PriorityQueue<int[]> cacheMinHeap = new PriorityQueue<>((a, b) -> {
            if (a[1] == b[1])
                return a[2] - b[2];
            else
                return a[1] - b[1];
        });

        int[] res = new int[tasks.length];
        int r = 0;
        int time = 0;
        int lockedTill = 0;

        while (r < tasks.length) {
            while (tasksMinHeap.peek() != null && tasksMinHeap.peek()[0] <= time)
                cacheMinHeap.offer(tasksMinHeap.poll());

            if (cacheMinHeap.isEmpty()) {
                time = tasksMinHeap.peek()[0];
                continue;
            }

            int[] task = cacheMinHeap.poll();
            time += task[1];
            res[r++] = task[2];
        }

        return res;
    }
}
