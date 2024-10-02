package E_Sliding_Window.B_Medium;

public class _0413_Arithmetic_Slices {

    public int numberOfArithmeticSlices(int[] nums) {
        if (nums.length < 3) return 0;
        int count = 0;
        int current = 0;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                current++;
                count += current;
            } else {
                current = 0;
            }
        }

        return count;
    }
}
