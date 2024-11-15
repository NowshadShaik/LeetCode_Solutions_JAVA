package Solutions;

import java.util.HashSet;
import java.util.Set;

public class _2501_Longest_Square_Streak_In_An_Array {

    class Solution {
        public int longestSquareStreak(int[] nums) {
            int res = -1;
            Set<Integer> set = new HashSet<>();

            for(int i =0;i<nums.length;i++) set.add(nums[i]);

            for(int i = 0; i<nums.length; i++) {
                int tempRes = 1;
                long temp = nums[i];
                while(set.contains((int)(temp * temp))) {
                    temp = temp * temp;
                    if(temp>1e5) break;
                    tempRes++;
                }
                if(tempRes >1) {
                    res = Math.max(res, tempRes);
                }
            }
            return res;
        }
    }
}
