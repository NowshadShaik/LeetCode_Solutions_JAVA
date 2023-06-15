package A_Arrays.B_Medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class _0056_Merge_Intervals {

    class Solution {
        public int[][] merge(int[][] intervals) {
            Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
            LinkedList<int[]> ans = new LinkedList<>();

            for (int[] a : intervals) {
                if (ans.isEmpty() || ans.getLast()[1] < a[0]) {
                    ans.add(a);
                } else {
                    ans.getLast()[1] = Math.max(ans.getLast()[1], a[1]);
                }
            }
            return ans.toArray(new int[ans.size()][]);
        }
    }

}