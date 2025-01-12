package Solutions;

public class _0695_Max_Area_of_Island {

    int r;
    int c;
    int res;

    public int maxAreaOfIsland(int[][] grid) {
        r = grid.length;
        c = grid[0].length;
        res = 0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                if (grid[i][j] == 1) {
                    res = Math.max(res, dfs(i, j, grid));
                }
            }
        }

        return res;
    }

    private int dfs(int i, int j, int[][] grid) {
        if (i < 0 || j < 0 || i >= r || j >= c || grid[i][j] == 0)
            return 0;

        grid[i][j] = 0;

        return 1 + dfs(i + 1, j, grid) + dfs(i, j + 1, grid) + dfs(i - 1, j, grid) + dfs(i, j - 1, grid);
    }
}
