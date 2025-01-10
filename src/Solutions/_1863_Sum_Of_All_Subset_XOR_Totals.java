package Solutions;

public class _1863_Sum_Of_All_Subset_XOR_Totals {

    int res;

    public int subsetXORSum(int[] nums) {
        backtrack(nums, 0, 0);
        return res;
    }

    private void backtrack(int[] nums, int i, int curr) {
        if (i >= nums.length) {
            res += curr;
            return;
        }

        backtrack(nums, i + 1, curr ^ nums[i]);
        backtrack(nums, i + 1, curr);
    }
}
