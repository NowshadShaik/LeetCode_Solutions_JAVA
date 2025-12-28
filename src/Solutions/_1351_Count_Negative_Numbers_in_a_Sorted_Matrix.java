package Solutions;

public class _1351_Count_Negative_Numbers_in_a_Sorted_Matrix {

    public int countNegatives(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int count = 0;

        for (int i = 0; i < rows; i++) {
            int l = 0, r = cols - 1;
            int neg = cols;

            while (l <= r) {
                int m = (l + r) / 2;

                if (grid[i][m] < 0) {
                    neg = m;
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            }

            count += cols - neg;
        }

        return count;
    }
}
