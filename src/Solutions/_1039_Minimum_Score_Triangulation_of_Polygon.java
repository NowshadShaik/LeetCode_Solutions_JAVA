package Solutions;

import java.util.Arrays;

public class _1039_Minimum_Score_Triangulation_of_Polygon {

    int[][] memo = new int[50][50];

    public int minScoreTriangulation(int[] values) {
        int n = values.length;
        memo = new int[n][n];
        for (int[] m : memo)
            Arrays.fill(m, -1);

        return solve(values, 0, values.length - 1);
    }

    private int solve(int[] values, int i, int j) {

        if ((j - i + 1) < 3)
            return 0;

        if (memo[i][j] != -1)
            return memo[i][j];

        int res = Integer.MAX_VALUE;
        for (int k = i + 1; k < j; k++) {

            int curr = (values[i] * values[k] * values[j]) + solve(values, i, k) + solve(values, k, j);

            res = Math.min(res, curr);
        }

        return memo[i][j] = res;
    }
}
