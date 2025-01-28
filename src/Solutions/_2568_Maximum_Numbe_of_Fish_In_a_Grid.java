package Solutions;

public class _2568_Maximum_Numbe_of_Fish_In_a_Grid {
    int maxFish;
    int m;
    int n;

    public int findMaxFish(int[][] grid) {
        m = grid.length;
        n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] > 0) {
                    int[] currFish = new int[1];
                    dfs(i, j, currFish, grid);

                    maxFish = Math.max(maxFish, currFish[0]);
                }
            }
        }

        return maxFish;
    }

    private void dfs(int i, int j, int[] currFish, int[][] grid) {
        if (i < 0 || j < 0 || i >= m || j >= n || grid[i][j] == 0)
            return;

        currFish[0] += grid[i][j];
        grid[i][j] = 0;

        dfs(i + 1, j, currFish, grid);
        dfs(i, j + 1, currFish, grid);
        dfs(i - 1, j, currFish, grid);
        dfs(i, j - 1, currFish, grid);
    }
}
