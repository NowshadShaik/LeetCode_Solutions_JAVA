package A_Arrays_and_Strings.B_Medium;

public class _0055_Jump_Sum {

    class Solution {
        public boolean canJump(int[] nums) {
            int maxReach = 0;
            for(int i=0;i<nums.length;i++) {
                if(i > maxReach) return false;
                maxReach = Math.max(maxReach, i + nums[i]);
                if(maxReach>=nums.length-1) return true;
            }
            return false;
        }
    }
}