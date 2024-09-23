package A_Arrays_and_Strings.A_Easy;

public class _1929_Concatenation_of_Array {
    
    class Solution {
        public int[] getConcatenation(int[] nums) {
    
            int [] ans = new int[nums.length * 2];
            for(int i=0;i<nums.length;i++) {
                ans[i] = nums[i];
                ans[i+nums.length] = nums[i];
            }
    
            return ans;
        }
    }
}
