package Solutions;

public class _0463_Island_Perimeter {

    int r;
    int c;
    int res;
    boolean[][] visited;

    public int islandPerimeter(int[][] grid) {
        r = grid.length;
        c = grid[0].length;
        visited = new boolean[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                if (grid[i][j] == 1)
                    return calcPeri(grid, i, j);
            }
        }

        return 0;
    }

    private int calcPeri(int[][] grid, int i, int j) {
        if (i >= r || j >= c || i < 0 || j < 0 || grid[i][j] == 0)
            return 1;

        if (visited[i][j])
            return 0;

        visited[i][j] = true;

        return calcPeri(grid, i + 1, j) + calcPeri(grid, i, j + 1) + calcPeri(grid, i - 1, j) + calcPeri(grid, i, j - 1);
    }
}
