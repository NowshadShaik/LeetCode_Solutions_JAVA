package Solutions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class _2402_Meeting_Rooms_III {

    public int mostBooked(int n, int[][] meetings) {
        Arrays.sort(meetings, Comparator.comparingInt(a -> a[0]));

        PriorityQueue<Integer> freeRooms = new PriorityQueue<>();
        PriorityQueue<long[]> busyRooms = new PriorityQueue<>((a, b) -> a[0] == b[0] ? Long.compare(a[1], b[1]) : Long.compare(a[0], b[0]));

        for (int i = 0; i < n; i++)
            freeRooms.offer(i);

        int[] usage = new int[n];

        for (int[] meet : meetings) {
            int start = meet[0], end = meet[1];

            while (!busyRooms.isEmpty() && busyRooms.peek()[0] <= start)
                freeRooms.offer((int) busyRooms.poll()[1]);

            long newEnd;
            int room;

            if (freeRooms.isEmpty()) {
                long[] soon = busyRooms.poll();
                newEnd = soon[0] + (end - start);
                room = (int) soon[1];
            } else {
                newEnd = end;
                room = freeRooms.poll();
            }

            usage[room]++;
            busyRooms.offer(new long[]{newEnd, room});
        }

        int mostUsed = 0;
        for (int i = 0; i < n; i++)
            if (usage[i] > usage[mostUsed])
                mostUsed = i;


        return mostUsed;
    }
}
