package A_Arrays_and_Strings.A_Easy;

public class _0136_Single_Number {

    class Solution {
        public int singleNumber(int[] nums) {

            int ans = 0;
            for(int i=0;i<nums.length;i++) {
                ans = ans ^ nums[i];
            }
            return ans;
        }
    }
}
