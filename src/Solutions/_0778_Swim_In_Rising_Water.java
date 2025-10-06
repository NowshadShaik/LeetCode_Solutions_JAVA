package Solutions;

public class _0778_Swim_In_Rising_Water {

    int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    int n;

    public int swimInWater(int[][] grid) {
        n = grid.length;

        int l = grid[0][0], r = (n * n) - 1;
        int res = 0;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            boolean[][] visited = new boolean[n][n];
            if (reachPossible(mid, 0, 0, grid, visited)) {
                res = mid;
                r = mid - 1;
            } else
                l = mid + 1;
        }

        return res;
    }

    private boolean reachPossible(int t, int i, int j, int[][] grid, boolean[][] visited) {
        if (i < 0 || j < 0 || i >= n || j >= n || visited[i][j] == true || grid[i][j] > t)
            return false;

        visited[i][j] = true;

        if (i == n - 1 && j == n - 1)
            return true;

        for (int[] dir : directions) {
            int p = i + dir[0];
            int q = j + dir[1];

            if (reachPossible(t, p, q, grid, visited))
                return true;
        }

        return false;
    }
}
