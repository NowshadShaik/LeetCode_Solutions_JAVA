package Solutions;

import java.util.Arrays;

public class _0611_Valid_Triangle_Number {

    public int triangleNumber(int[] nums) {
        int res = 0;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                int idx = binSearch(nums, j + 1, nums.length - 1, nums[i] + nums[j]);
                res += (idx - j - 1);
            }
        }

        return res;
    }

    private int binSearch(int[] nums, int l, int r, int target) {

        while (l <= r) {
            int m = (l + r) / 2;

            if (nums[m] < target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return l;
    }
}
