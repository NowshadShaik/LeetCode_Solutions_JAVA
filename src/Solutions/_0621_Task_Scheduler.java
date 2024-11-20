package Solutions;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class _0621_Task_Scheduler {

    public int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];
        for(char c : tasks) count[c - 'A']++;

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int c : count) {
            if(c > 0) maxHeap.offer(c);
        }

        int time = 0;
        Queue<int[]> queue = new LinkedList<>();
        while(!maxHeap.isEmpty() || !queue.isEmpty()) {
            time++;

            if(maxHeap.isEmpty()) {
                time = queue.peek()[1];
            } else {
                int cnt = maxHeap.poll()-1;
                if(cnt>0)
                    queue.add(new int[] {cnt, time + n});
            }

            if(!queue.isEmpty() && queue.peek()[1] == time) {
                maxHeap.add(queue.poll()[0]);
            }
        }
        return time;
    }
}
