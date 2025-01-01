package Solutions;

public class _0075_Sort_Colors {

    public void sortColors(int[] nums) {
        int l = 0, r = nums.length - 1;

        for (int i = 0; i <= r; i++) {
            if (nums[i] == 0) {
                int temp = nums[l];
                nums[l++] = nums[i];
                nums[i] = temp;
            } else if (nums[i] == 2) {
                int temp = nums[r];
                nums[r--] = nums[i];
                nums[i] = temp;
                i--;
            }
        }
    }
}
