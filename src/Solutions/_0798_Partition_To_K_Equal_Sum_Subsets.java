package Solutions;

import java.util.Arrays;

public class _0798_Partition_To_K_Equal_Sum_Subsets {

    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = Arrays.stream(nums).sum();
        if (sum % k != 0)
            return false;

        Arrays.sort(nums);
        for (int i = 0, j = nums.length - 1; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        int target = sum / k;
        int[] subsets = new int[k];
        return backtrack(nums, subsets, 0, target);
    }

    private boolean backtrack(int[] nums, int[] subsets, int i, int target) {
        if (i >= nums.length) {
            for (int j = 1; j < subsets.length; j++) {
                if (subsets[j - 1] != subsets[j])
                    return false;
            }
            return true;
        }

        for (int j = 0; j < subsets.length; j++) {
            if (j > 0 && subsets[j] == subsets[j - 1])
                continue;

            if (subsets[j] + nums[i] <= target) {
                subsets[j] += nums[i];
                if (backtrack(nums, subsets, i + 1, target))
                    return true;
                subsets[j] -= nums[i];
            }
        }

        return false;
    }
}
