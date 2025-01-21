package Solutions;

public class _2017_Grid_Game {

    public long gridGame(int[][] grid) {
        long f = 0;
        long s = 0;

        long res = Long.MAX_VALUE;

        for (int i = 0; i < grid[0].length; i++)
            f += grid[0][i];

        for (int i = 0; i < grid[0].length; i++) {
            f -= grid[0][i];

            res = Math.min(res, Math.max(f, s));

            s += grid[1][i];
        }

        return res;
    }
}
