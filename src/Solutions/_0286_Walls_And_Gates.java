package Solutions;

public class _0286_Walls_And_Gates {

    int r;
    int c;

    public void islandsAndTreasure(int[][] grid) {
        r = grid.length;
        c = grid[0].length;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                if (grid[i][j] == 0)
                    dfs(i, j, grid, 0);
            }
        }
    }

    private void dfs(int i, int j, int[][] grid, int d) {
        if (i < 0 || j < 0 || i >= r || j >= c || grid[i][j] == -1 || d > grid[i][j])
            return;

        if (d < grid[i][j])
            grid[i][j] = d;

        dfs(i + 1, j, grid, d + 1);
        dfs(i - 1, j, grid, d + 1);
        dfs(i, j + 1, grid, d + 1);
        dfs(i, j - 1, grid, d + 1);
    }
}
