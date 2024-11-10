package A_Arrays_and_Strings.B_Medium;

public class _3097_Shortest_Subarray_With_Or_Atleast_k_II {

    public int minimumSubarrayLength(int[] nums, int k) {
        int[] count = new int[32];
        int res = Integer.MAX_VALUE;
        int start = 0, end = 0;
        while (end < nums.length) {
            updateBits(count, nums[end], 1);

            while (start <= end && getVal(count) >= k) {
                res = Math.min(res, end - start + 1);
                updateBits(count, nums[start], -1);
                start++;
            }
            end++;
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }

    private void updateBits(int[] count, int num, int val) {
        for (int i = 0; i < 32; i++) {
            if (((num >> i) & 1) == 1) {
                count[i] += val;
            }
        }
    }

    private int getVal(int[] count) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            if (count[i] > 0) {
                ans = ans | (1 << i);
            }
        }
        return ans;
    }
}
