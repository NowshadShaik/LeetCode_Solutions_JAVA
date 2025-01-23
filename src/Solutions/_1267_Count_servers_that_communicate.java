package Solutions;

public class _1267_Count_servers_that_communicate {

    public int countServers(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] rows = new int[m];
        int[] cols = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == 1) {
                    rows[i] += 1;
                    cols[j] += 1;
                }
            }
        }

        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == 1) {
                    res += (rows[i] > 1 || cols[j] > 1) ? 1 : 0;
                }
            }
        }

        return res;
    }
}
