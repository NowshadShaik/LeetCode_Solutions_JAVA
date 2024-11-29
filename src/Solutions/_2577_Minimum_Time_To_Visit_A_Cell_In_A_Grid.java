package Solutions;

import java.util.PriorityQueue;

public class _2577_Minimum_Time_To_Visit_A_Cell_In_A_Grid {

    private static final int[][] MOVES = { {0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public int minimumTime(int[][] grid) {
        int r = grid.length, c = grid[0].length;

        if(grid[0][1] > 1 && grid[1][0] > 1) {
            return -1;
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        boolean[][] seen = new boolean[r][c];

        pq.offer(new int[] {0, 0, 0});
        seen[0][0] = true;

        while(!pq.isEmpty()) {
            int[] curr = pq.poll();
            int time = curr[0];
            int row = curr[1];
            int col = curr[2];

            for(int[] dir : MOVES) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];

                if(newRow < 0 || newRow >= r ||
                        newCol < 0 || newCol >= c ||
                        seen[newRow][newCol]) {
                    continue;
                }

                int newTime = time + 1;
                if(grid[newRow][newCol] > newTime) {
                    int wait = ((grid[newRow][newCol] - newTime + 1) / 2) * 2;
                    newTime += wait;
                }

                if(newRow == r - 1 && newCol == c - 1) {
                    return newTime;
                }

                seen[newRow][newCol] = true;
                pq.offer(new int[] {newTime, newRow, newCol});

            }
        }
        return -1;
    }
}
