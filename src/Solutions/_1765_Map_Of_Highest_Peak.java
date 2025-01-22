package Solutions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class _1765_Map_Of_Highest_Peak {

    int m;
    int n;
    int[][] heights;
    int[][] dirs = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public int[][] highestPeak(int[][] isWater) {
        m = isWater.length;
        n = isWater[0].length;
        heights = new int[m][n];

        for (int[] row : heights)
            Arrays.fill(row, -1);

        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (isWater[i][j] == 1) {
                    heights[i][j] = 0;
                    queue.offer(new int[]{i, j, 0});
                }
            }
        }

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();

            int r = curr[0];
            int c = curr[1];
            int h = curr[2];

            for (int[] dir : dirs) {
                int nr = r + dir[0];
                int nc = c + dir[1];

                if (nr < 0 || nc < 0 || nr >= m || nc == n || heights[nr][nc] != -1)
                    continue;

                heights[nr][nc] = h + 1;

                queue.offer(new int[]{nr, nc, h + 1});
            }
        }

        return heights;
    }
}
