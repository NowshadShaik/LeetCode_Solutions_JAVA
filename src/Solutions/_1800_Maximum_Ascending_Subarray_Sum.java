package Solutions;

public class _1800_Maximum_Ascending_Subarray_Sum {

    public int maxAscendingSum(int[] nums) {
        int res = nums[0];

        int curr = nums[0];
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] <= nums[i - 1])
                curr = 0;

            curr += nums[i];
            res = Math.max(res, curr);
        }

        return res;
    }
}
