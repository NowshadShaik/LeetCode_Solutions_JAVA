package Solutions;

import java.util.Arrays;

public class _0300_Longest_Increasing_Sub_Sequence {

    public int lengthOfLIS(int[] nums) {
        int[] LIS = new int[nums.length];
        Arrays.fill(LIS, 1);

        for(int i =0;i<nums.length;i++) {
            for(int j=0;j<i;j++) {
                if(nums[i]>nums[j]) {
                    LIS[i] = Math.max(LIS[i], LIS[j]+1);
                }
            }
        }

        int max = Integer.MIN_VALUE;
        for(int i=0;i<LIS.length;i++) {
            max = Math.max(max, LIS[i]);
        }
        return max;
    }
}
