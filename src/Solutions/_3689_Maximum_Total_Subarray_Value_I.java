package Solutions;

public class _3689_Maximum_Total_Subarray_Value_I {

    public long maxTotalValue(int[] nums, int k) {
        long res = 0;

        long min = nums[0];
        long max = nums[0];
        for (int n : nums) {
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        res = (max - min) * k;

        return res;
    }
}
