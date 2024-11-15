package Solutions;

public class _0209_Minimum_Size_Subarray_Sum {

    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int l = 0;

        int ans = Integer.MAX_VALUE;
        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];
            while (sum >= target && sum - nums[l] >= target) {
                sum -= nums[l++];
            }
            if (sum >= target) {
                ans = Math.min(ans, r - l + 1);
            }
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
}
