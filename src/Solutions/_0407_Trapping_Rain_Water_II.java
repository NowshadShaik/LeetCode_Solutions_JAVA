package Solutions;

import java.util.PriorityQueue;

public class _0407_Trapping_Rain_Water_II {

    public int trapRainWater(int[][] heightMap) {
        int rows = heightMap.length;
        int cols = heightMap[0].length;

        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    minHeap.offer(new int[]{heightMap[i][j], i, j});
                    heightMap[i][j] = -1;
                }
            }
        }

        int res = 0;
        int max_h = 0;
        int[][] dirs = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        while (!minHeap.isEmpty()) {
            int[] arr = minHeap.poll();
            int h = arr[0];
            int r = arr[1];
            int c = arr[2];

            max_h = Math.max(max_h, h);
            res += max_h - h;

            for (int[] dir : dirs) {
                int nr = r + dir[0];
                int nc = c + dir[1];

                if (nr < 0 || nc < 0 || nr >= rows || nc >= cols || heightMap[nr][nc] == -1)
                    continue;

                minHeap.offer(new int[]{heightMap[nr][nc], nr, nc});
                heightMap[nr][nc] = -1;
            }
        }

        return res;
    }
}
