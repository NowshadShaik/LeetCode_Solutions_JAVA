package A_Arrays.A_Easy;

import java.util.ArrayList;
import java.util.List;

public class _0118_Pascals_Triangle {

    class Solution {
        public List<List<Integer>> generate(int numRows) {

            List<List<Integer>> ans = new ArrayList<>();
            ans.add(List.of(1));
            if(numRows==1) return ans;

            for(int i=1;i<numRows;i++) {
                List<Integer> preRow = ans.get(i-1);
                List<Integer> curRow = new ArrayList<>();

                curRow.add(1);
                for(int j=1;j<i;j++) {
                    curRow.add(preRow.get(j-1) + preRow.get(j));
                }
                curRow.add(1);
                ans.add(curRow);
            }

            return ans;

        }
    }
}
