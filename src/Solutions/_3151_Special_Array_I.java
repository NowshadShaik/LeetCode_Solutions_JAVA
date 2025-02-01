package Solutions;

public class _3151_Special_Array_I {

    public boolean isArraySpecial(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            if ((nums[i] % 2 == nums[i - 1] % 2))
                return false;
        }

        return true;
    }
}
