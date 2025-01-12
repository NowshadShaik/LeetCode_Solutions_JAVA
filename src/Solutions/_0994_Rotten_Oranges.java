package Solutions;

public class _0994_Rotten_Oranges {

    int r;
    int c;
    int[][] rotten;


    public int orangesRotting(int[][] grid) {
        r = grid.length;
        c = grid[0].length;

        rotten = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                if (grid[i][j] == 1 || grid[i][j] == 2)
                    rotten[i][j] = Integer.MAX_VALUE;
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                if (grid[i][j] == 2) {
                    dfs(i, j, grid, 0);
                }
            }
        }

        int res = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                res = Math.max(res, rotten[i][j]);
            }
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }

    private void dfs(int i, int j, int[][] grid, int d) {
        if (i < 0 || j < 0 || i >= r || j >= c || grid[i][j] == 0 || d > rotten[i][j])
            return;

        rotten[i][j] = d;

        dfs(i + 1, j, grid, d + 1);
        dfs(i, j + 1, grid, d + 1);
        dfs(i - 1, j, grid, d + 1);
        dfs(i, j - 1, grid, d + 1);
    }
}
