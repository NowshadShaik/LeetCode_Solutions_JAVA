package D_Binary_Search.B_Medium;

public class _0074_Search_A_2D_Matrix {
    
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int top = 0, bot = matrix.length-1;
        while(top<=bot) {
            int m = (top + bot)/2;
            if(target<matrix[m][0]) bot = m-1;
            else if(target>matrix[m][matrix[0].length-1]) top=m+1;
            else break;
        }
        if(top>bot) return false;

        int row = (top+bot)/2;

        int left = 0, right = matrix[row].length-1;
        while(left<=right) {
            int m = (left + right)/2;
            if(matrix[row][m] == target) return true;
            else if (matrix[row][m] < target) left = m+1;
            else right = m-1;
        }
        return false;
    }
}
