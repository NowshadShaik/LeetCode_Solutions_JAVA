package Solutions;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class _0621_Task_Scheduler {

    public int leastInterval(char[] tasks, int n) {
        int time = 0;

        int[] freq = new int[26];
        for(char c: tasks)
            freq[c - 'A']++;

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[1] - b[1]);

        for(int i=0;i<26;i++) {
            if(freq[i] != 0)
                minHeap.offer(new int[] {freq[i], 1});
        }

        while(!minHeap.isEmpty()) {
            time++;
            int[] entry = minHeap.poll();

            if(time < entry[1])
                time = entry[1];

            entry[0]--;
            if(entry[0] > 0) {
                entry[1] += n+1;
                minHeap.offer(entry);
            }
        }

        return time;
    }
}
