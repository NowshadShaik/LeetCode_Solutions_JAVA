package Solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _0417_Pacific_Atlantic_Water_Flow {

    private int[][] directions = {{1, 0}, {-1, 0},
            {0, 1}, {0, -1}};

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int r = heights.length;
        int c = heights[0].length;
        boolean[][] pac = new boolean[r][c];
        boolean[][] atl = new boolean[r][c];

        for (int i = 0; i < c; i++) {
            dfs(0, i, heights, pac);
            dfs(r - 1, i, heights, atl);
        }

        for (int i = 0; i < r; i++) {
            dfs(i, 0, heights, pac);
            dfs(i, c - 1, heights, atl);
        }

        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                if (pac[i][j] && atl[i][j]) {
                    res.add(Arrays.asList(i, j));
                }
            }
        }

        return res;
    }

    private void dfs(int r, int c, int[][] heights, boolean[][] ocean) {
        ocean[r][c] = true;
        for (int[] d : directions) {
            int nr = r + d[0];
            int nc = c + d[1];

            if (nr >= 0 && nr < heights.length &&
                    nc >= 0 && nc < heights[0].length &&
                    !ocean[nr][nc] && heights[nr][nc] >= heights[r][c]) {
                dfs(nr, nc, heights, ocean);
            }
        }
    }
}
