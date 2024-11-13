package A_Arrays_and_Strings.B_Medium;

import java.util.Arrays;

public class _2563_Count_The_Number_Of_Fairs_Pairs {

    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        int n = nums.length;
        long res = 0;
        for (int i = 0; i < n; i++) {
            int u = find(nums, upper - nums[i] + 1, i + 1, n - 1);
            int l = find(nums, lower - nums[i], i + 1, n - 1);
            res += u - l;
        }
        return res;
    }

    private int find(int[] nums, int target, int left, int right) {
        int l = left, r = right;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] >= target) r = m - 1;
            else l = m + 1;
        }
        return r;
    }
}
