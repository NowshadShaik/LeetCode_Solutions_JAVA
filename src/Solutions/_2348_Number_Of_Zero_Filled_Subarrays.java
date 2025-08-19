package Solutions;

public class _2348_Number_Of_Zero_Filled_Subarrays {

    public long zeroFilledSubarray(int[] nums) {
        long res = 0;

        int trailZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                res++;
                res += trailZero;
                trailZero++;
            } else
                trailZero = 0;
        }

        return res;
    }
}
