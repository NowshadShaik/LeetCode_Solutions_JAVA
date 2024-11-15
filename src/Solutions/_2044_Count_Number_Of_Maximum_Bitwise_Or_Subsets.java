package Solutions;

public class _2044_Count_Number_Of_Maximum_Bitwise_Or_Subsets {

    public int countMaxOrSubsets(int[] nums) {
        int max = 0;
        for (int n : nums) max |= n;

        int[] res = new int[1];
        backtrack(nums, 0, 0, max, res);
        return res[0];
    }

    private void backtrack(int[] nums, int index, int currOr, int maxOr, int[] res) {
        if (currOr == maxOr) {
            res[0]++;
        }

        for (int i = index; i < nums.length; i++) {
            backtrack(nums, i + 1, currOr | nums[i], maxOr, res);
        }
    }
}
