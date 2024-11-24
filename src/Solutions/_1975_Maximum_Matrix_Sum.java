package Solutions;

public class _1975_Maximum_Matrix_Sum {

    public long maxMatrixSum(int[][] matrix) {
        int n = matrix.length;

        long sum = 0;
        int abs = Integer.MAX_VALUE;
        int neg = 0;

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                int curr = Math.abs(matrix[i][j]);

                if(matrix[i][j]<0) {
                    neg++;
                }
                abs = Math.min(abs, curr);

                sum += curr;
            }
        }

        if(neg % 2 !=0) {
            sum -= (2 * abs);
        }

        return sum;
    }
}
