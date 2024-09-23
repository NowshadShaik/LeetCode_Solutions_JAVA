package A_Arrays_and_Strings.B_Medium;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int l = 0, r = matrix[0].length;
        int t = 0, b = matrix.length;

        while(t<b && l<r) {
            for(int i=l;i<r;i++) {
                ans.add(matrix[t][i]);
            }
            t++;
            for(int i=t;i<b;i++) {
                ans.add(matrix[i][r-1]);
            }
            r--;

            if(t<b) {
                for(int i=r-1;i>=l;i--) {
                    ans.add(matrix[b-1][i]);
                }
                b--;
            }

            if(l<r) {
                for(int i=b-1;i>=t;i--) {
                    ans.add(matrix[i][l]);
                }
                l++;
            }
        }
        return ans;
    }
}