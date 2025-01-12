package Solutions;

public class _0200_Number_Of_Islands {

    int r;
    int c;
    int res;

    public int numIslands(char[][] grid) {
        res = 0;

        r = grid.length;
        c = grid[0].length;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                if (grid[i][j] == '1') {
                    dfs(i, j, grid);
                    res++;
                }
            }
        }

        return res;
    }

    private void dfs(int i, int j, char[][] grid) {
        if (i < 0 || j < 0 || i >= r || j >= c || grid[i][j] == '0')
            return;

        grid[i][j] = '0';

        dfs(i + 1, j, grid);
        dfs(i, j + 1, grid);
        dfs(i - 1, j, grid);
        dfs(i, j - 1, grid);
    }
}
