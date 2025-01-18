package Solutions;

import java.util.Arrays;
import java.util.PriorityQueue;

public class _1368_Minimum_Path_To_Make_Atleast_One_Valid_Path_In_Grid {

    int[][] dirs = new int[][] {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public int minCost(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.offer(new int[] {0,0,0});

        int[][] minCost = new int[rows][cols];
        for(int[] row : minCost)
            Arrays.fill(row, Integer.MAX_VALUE);

        minCost[0][0] = 0;

        while(!pq.isEmpty()) {
            int[] curr = pq.poll();

            int cost = curr[0];
            int row = curr[1];
            int col = curr[2];

            if(minCost[row][col] != cost) continue;

            for(int dir=0; dir<4; dir++) {
                int r = row + dirs[dir][0];
                int c = col + dirs[dir][1];

                if(r>=0 && c >=0 && r<rows && c<cols) {
                    int newCost = cost + (dir != (grid[row][col] - 1) ? 1 : 0);

                    if(minCost[r][c] > newCost) {
                        minCost[r][c] = newCost;
                        pq.offer(new int[] {newCost, r, c});
                    }
                }
            }
        }
        return minCost[rows-1][cols-1];
    }
}
