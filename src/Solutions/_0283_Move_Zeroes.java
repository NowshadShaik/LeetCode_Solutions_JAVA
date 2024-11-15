package Solutions;

public class _0283_Move_Zeroes {

    public void moveZeroes(int[] nums) {
        int p1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[p1++] = nums[i];
            }
        }

        while (p1 < nums.length) nums[p1++] = 0;
    }
}
