package A_Arrays_and_Strings.B_Medium;

public class _1277_Count_Square_Submatrices_With_All_Ones {

    public int countSquares(int[][] matrix) {
        int l = matrix.length;
        int h = matrix[0].length;

        int[][] cache = new int[l][h];
        int ans = 0;

        for(int i=0;i<l;i++) {
            cache[i][0] = matrix[i][0];
            ans+=matrix[i][0];
        }
        for(int i=1;i<h;i++) {
            cache[0][i] = matrix[0][i];
            ans+=matrix[0][i];
        }

        for(int i=1;i<l;i++) {
            for(int j=1;j<h;j++) {
                if(matrix[i][j] == 1) {
                    cache[i][j] = 1 + Math.min(Math.min(cache[i][j-1], cache[i-1][j]), cache[i-1][j-1]);
                }
                ans+=cache[i][j];
            }
        }
        return ans;
    }
}
