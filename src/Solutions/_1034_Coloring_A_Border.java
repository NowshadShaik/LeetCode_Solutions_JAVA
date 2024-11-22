package Solutions;

public class _1034_Coloring_A_Border {

    int[][] grid;
    boolean[][] visited;
    int compCol;
    public int[][] colorBorder(int[][] grid, int row, int col, int color) {
        this.grid = grid;
        if(grid[row][col] == color) return grid;

        this.visited = new boolean[grid.length][grid[0].length];
        this.compCol = grid[row][col];

        colorCurrent(row, col, color);

        return grid;
    }

    private void colorCurrent(int r, int c, int color) {
        if(r >= grid.length || r < 0 || c >= grid[0].length || c < 0 || visited[r][c] || grid[r][c] != compCol) {
            return;
        }

        visited[r][c] = true;

        boolean isBorder = false;
        if(r == grid.length-1 || r == 0 || c == grid[0].length-1 || c == 0 ||
                grid[r+1][c] != compCol || grid[r-1][c] != compCol ||
                grid[r][c+1] != compCol || grid[r][c-1] != compCol) {
            isBorder = true;
        }

        colorCurrent(r+1, c, color);
        colorCurrent(r-1, c, color);
        colorCurrent(r, c+1, color);
        colorCurrent(r, c-1, color);

        if(isBorder)
            grid[r][c] = color;
    }
}
