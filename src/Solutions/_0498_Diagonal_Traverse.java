package Solutions;

public class _0498_Diagonal_Traverse {

    public int[] findDiagonalOrder(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int[] res = new int[rows * cols];
        int r = 0;

        int cRow = 0, cCol = 0;
        boolean up = true;
        while(r < (cols * rows)) {
            if(up) {
                while(cRow >=0 && cCol < cols) {
                    res[r++] = mat[cRow][cCol];

                    cRow--;
                    cCol++;
                }

                if(cCol >= cols) {
                    cCol--;
                    cRow += 2;
                } else
                    cRow++;

                up = false;

            } else {
                while(cRow < rows && cCol >= 0) {
                    res[r++] = mat[cRow][cCol];

                    cRow++;
                    cCol--;
                }

                if(cRow >= rows) {
                    cRow--;
                    cCol += 2;
                } else
                    cCol++;

                up = true;
            }
        }

        return res;
    }
}
