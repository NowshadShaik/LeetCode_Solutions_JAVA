package A_Arrays.A_Easy;

import java.util.Arrays;

public class _1637_Widest_Vertical_Area_Between_Two_Points_Containing_No_Points {
    
    class Solution {
        public int maxWidthOfVerticalArea(int[][] points) {

            Arrays.sort(points, (a,b) -> Integer.compare(a[0], b[0]));

            int ans=0;
            for(int i=0;i<points.length-1;i++) {
                ans = Math.max(ans, points[i+1][0] - points[i][0]);
            }
            return ans;
        }
    }
}
