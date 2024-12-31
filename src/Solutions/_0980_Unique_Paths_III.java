package Solutions;

public class _0980_Unique_Paths_III {

    public int uniquePathsIII(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    return dfs(grid, i, j);
                }
            }
        }
        return 0;
    }

    private int dfs(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == -1 || grid[i][j] == -2) {
            return 0;
        }

        if (grid[i][j] == 2 && didItPassAll(grid)) {
            return 1;
        } else if (grid[i][j] == 2) {
            return 0;
        }

        int temp = grid[i][j];
        grid[i][j] = -2;
        int left = dfs(grid, i, j - 1);
        int right = dfs(grid, i, j + 1);
        int down = dfs(grid, i + 1, j);
        int up = dfs(grid, i - 1, j);
        grid[i][j] = temp;
        return left + right + down + up;
    }

    public boolean didItPassAll(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0)
                    return false;
            }
        }
        return true;
    }
}
