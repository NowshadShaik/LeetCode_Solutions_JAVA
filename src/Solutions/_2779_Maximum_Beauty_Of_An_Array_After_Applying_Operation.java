package Solutions;

import java.util.Arrays;

public class _2779_Maximum_Beauty_Of_An_Array_After_Applying_Operation {

    public int maximumBeauty(int[] nums, int k) {
        int res = 0;
        Arrays.sort(nums);
        int l = 0;

        for (int r = 0; r < nums.length; r++) {

            while (nums[r] - nums[l] > 2 * k)
                l++;


            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}
