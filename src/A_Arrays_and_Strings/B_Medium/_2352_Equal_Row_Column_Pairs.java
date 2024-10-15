package A_Arrays_and_Strings.B_Medium;

public class _2352_Equal_Row_Column_Pairs {

    public int equalPairs(int[][] grid) {
        int res = 0;
        int n = grid.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean isEqual = true;
                for (int k = 0; k < n; k++) {
                    if (grid[i][k] != grid[k][j]) {
                        isEqual = false;
                        break;
                    }
                }
                if (isEqual) {
                    res++;
                }
            }
        }
        return res;
    }
}
