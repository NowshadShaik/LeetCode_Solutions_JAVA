package A_Arrays_and_Strings.B_Medium;

public class _2684_Maximum_Number_Of_Moves_In_Grid {

    class Solution {
        private Integer[][] memo;
        public int maxMoves(int[][] grid) {
            int res = 0;
            this.memo = new Integer[grid.length][grid[0].length];
            for(int i=0;i<grid.length;i++) {
                res = Math.max(res, check(grid, i, 0));
            }
            return res;
        }

        private int check(int[][] grid, int i, int j) {
            if(i<0 || i>=grid.length || j<0 || j>=grid[0].length) return 0;
            if (memo[i][j] != null) {
                return memo[i][j];
            }
            int currLen = -1;
            int val = grid[i][j];

            if(i-1 >= 0 && j+1 < grid[0].length && grid[i-1][j+1] > val) {
                currLen = Math.max(check(grid, i-1, j+1), currLen);
            }
            if(j+1 < grid[0].length && grid[i][j+1] > val) {
                currLen = Math.max(check(grid, i, j+1), currLen);
            }
            if(i+1 <grid.length && j+1 < grid[0].length && grid[i+1][j+1] > val) {
                currLen = Math.max(check(grid, i+1, j+1), currLen);
            }
            memo[i][j] = currLen+1;
            return memo[i][j];
        }
    }
}
