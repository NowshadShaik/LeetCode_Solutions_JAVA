package Solutions;

public class _2257_Count_Unguarded_Cells_In_Grid {

    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int[][] grid = new int[m][n];
        // 0->free, 1->guard, 2->wall, 3->guarded
        for (int[] guard : guards) {
            grid[guard[0]][guard[1]] = 1;
        }

        for (int[] wall : walls) {
            grid[wall[0]][wall[1]] = 2;
        }

        for (int[] guard : guards) {
            markGuarded(grid, guard[0], guard[1], m, n);
        }

        int res = 0;
        for (int[] row : grid) {
            for (int cell : row) {
                if (cell == 0) {
                    res++;
                }
            }
        }
        return res;
    }

    private void markGuarded(int[][] grid, int r, int c, int m, int n) {
        for (int i = r + 1; i < m; i++) {
            if (grid[i][c] == 2 || grid[i][c] == 1)
                break;
            grid[i][c] = 3;
        }
        for (int i = c + 1; i < n; i++) {
            if (grid[r][i] == 2 || grid[r][i] == 1)
                break;
            grid[r][i] = 3;
        }
        for (int i = r - 1; i >= 0; i--) {
            if (grid[i][c] == 2 || grid[i][c] == 1)
                break;
            grid[i][c] = 3;
        }
        for (int i = c - 1; i >= 0; i--) {
            if (grid[r][i] == 2 || grid[r][i] == 1)
                break;
            grid[r][i] = 3;
        }
    }
}
