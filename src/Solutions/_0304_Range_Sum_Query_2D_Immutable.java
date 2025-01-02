package Solutions;

public class _0304_Range_Sum_Query_2D_Immutable {

    int[][] prefixes;

    public _0304_Range_Sum_Query_2D_Immutable(int[][] matrix) {
        prefixes = matrix;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                prefixes[i][j] += prefixes[i][j - 1];
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;

        for (int i = row1; i <= row2; i++) {
            if (col1 == 0)
                sum += prefixes[i][col2];
            else
                sum += prefixes[i][col2] - prefixes[i][col1 - 1];
        }
        return sum;
    }
}
