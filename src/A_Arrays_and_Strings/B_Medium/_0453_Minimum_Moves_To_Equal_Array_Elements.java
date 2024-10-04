package A_Arrays_and_Strings.B_Medium;

public class _0453_Minimum_Moves_To_Equal_Array_Elements {

    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) min = Math.min(min, nums[i]);

        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res += -1 * (min - nums[i]);
        }
        return res;
    }
}
