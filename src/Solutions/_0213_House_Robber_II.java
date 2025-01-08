package Solutions;

import java.util.Arrays;

public class _0213_House_Robber_II {

    public int rob(int[] nums) {
        return Math.max(nums[0], Math.max(helper(Arrays.copyOfRange(nums, 1, nums.length)),
                helper(Arrays.copyOfRange(nums, 0, nums.length - 1))));
    }

    private int helper(int[] nums) {
        int rob1 = 0;
        int rob2 = 0;

        for (int n : nums) {
            int max = Math.max(rob1 + n, rob2);
            rob1 = rob2;
            rob2 = max;
        }

        return rob2;
    }
}
