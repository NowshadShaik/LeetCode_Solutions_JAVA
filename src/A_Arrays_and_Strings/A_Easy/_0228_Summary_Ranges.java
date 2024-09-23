package A_Arrays_and_Strings.A_Easy;

import java.util.ArrayList;
import java.util.List;

public class _0228_Summary_Ranges {

    class Solution {
        public List<String> summaryRanges(int[] nums) {

            List<String> ans = new ArrayList<>();

            for(int i=0;i<nums.length;i++) {
                int l = nums[i];
                while( i+1<nums.length && (nums[i+1] == nums[i]+1)) {
                    i++;
                }
                if(l == nums[i]) {
                    ans.add(""+l);
                } else {
                    ans.add(l+"->"+nums[i]);
                }
            }

            return ans;
        }
    }
}
