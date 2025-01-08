package Solutions;

public class _0427_Construct_Quad_Tree {

    public quadNode construct(int[][] grid) {
        return dfs(grid, grid.length, 0, 0);
    }

    private quadNode dfs(int[][] grid, int n, int r, int c) {
        boolean allSame = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[r][c] != grid[r + i][c + j])
                    allSame = false;
            }
        }

        if (allSame)
            return new quadNode(grid[r][c] == 1, true);

        n = n / 2;
        quadNode topLeft = dfs(grid, n, r, c);
        quadNode topRight = dfs(grid, n, r, c + n);
        quadNode bottomLeft = dfs(grid, n, r + n, c);
        quadNode bottomRight = dfs(grid, n, r + n, c + n);

        return new quadNode(false, false, topLeft, topRight, bottomLeft, bottomRight);
    }
}

class quadNode {
    public boolean val;
    public boolean isLeaf;
    public quadNode topLeft;
    public quadNode topRight;
    public quadNode bottomLeft;
    public quadNode bottomRight;


    public quadNode() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }

    public quadNode(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }

    public quadNode(boolean val, boolean isLeaf, quadNode topLeft, quadNode topRight, quadNode bottomLeft, quadNode bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
}