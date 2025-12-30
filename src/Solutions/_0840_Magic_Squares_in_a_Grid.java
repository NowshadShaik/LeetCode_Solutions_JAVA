package Solutions;

public class _0840_Magic_Squares_in_a_Grid {

    public int numMagicSquaresInside(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        if (rows < 3 || cols < 3)
            return 0;

        int res = 0;
        for (int i = 0; i < rows - 2; i++) {
            for (int j = 0; j < cols - 2; j++) {
                if (isMagicSquare(i, j, grid))
                    res++;
            }
        }

        return res;
    }

    private boolean isMagicSquare(int r, int c, int[][] grid) {
        int[] rowSum = new int[3];
        int[] colSum = new int[3];
        int[] diaSum = new int[2];
        boolean[] seen = new boolean[9];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                int curr = grid[r + i][j + c];
                if (curr < 1 || curr > 9)
                    return false;

                if (seen[curr - 1])
                    return false;

                rowSum[j] += curr;
                colSum[i] += curr;
                if (i == j)
                    diaSum[0] += curr;
                if (i + j == 2)
                    diaSum[1] += curr;

                seen[curr - 1] = true;
            }
        }

        if (rowSum[0] != colSum[0] || rowSum[0] != diaSum[0])
            return false;

        if (diaSum[0] != diaSum[1])
            return false;

        for (int i = 0; i < 2; i++) {
            if ((rowSum[i] != rowSum[i + 1]) || (colSum[i] != colSum[i + 1]))
                return false;
        }


        return true;
    }
}
