package Solutions;

import java.util.Arrays;

public class _0462_Minimum_Moves_To_Equal_Array_Elements_II {

    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int tar = nums[nums.length / 2];
        int ans = 0;

        for (int i = 0; i < nums.length; i++) ans += Math.abs(tar - nums[i]);

        return ans;
    }
}
