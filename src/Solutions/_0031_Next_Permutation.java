package Solutions;

public class _0031_Next_Permutation {

    public void nextPermutation(int[] nums) {
        if (nums.length == 1) return;

        int p = nums.length - 2;

        while (p >= 0 && nums[p] >= nums[p + 1])
            p--;

        if (p >= 0) {
            int n = nums.length - 1;

            while (nums[n] <= nums[p])
                n--;

            int temp = nums[p];
            nums[p] = nums[n];
            nums[n] = temp;
        }

        reverse(nums, p + 1);
    }

    private void reverse(int[] nums, int l) {
        int r = nums.length - 1;

        while (l < r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }
}
