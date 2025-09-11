package Solutions;

public class _3674_Minimum_Operations_To_Equalize_Array {

    public int minOperations(int[] nums) {
        int res = 0;
        if (nums.length == 1)
            return res;

        for (int i = 1; i < nums.length; i++)
            if (nums[i] != nums[i - 1])
                res = 1;

        return res;
    }
}
