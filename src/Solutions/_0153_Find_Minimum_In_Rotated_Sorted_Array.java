package Solutions;

public class _0153_Find_Minimum_In_Rotated_Sorted_Array {

    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;

        while (l <= r) {
            if (nums[l] <= nums[r])
                return nums[l];

            int m = (l + r) / 2;
            if (nums[l] <= nums[m])
                l = m + 1;
            else
                r = m;
        }
        return 0;
    }
}
