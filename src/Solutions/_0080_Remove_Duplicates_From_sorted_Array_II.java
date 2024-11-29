package Solutions;

public class _0080_Remove_Duplicates_From_sorted_Array_II {

    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;
        int p = 1;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[p] || nums[i] != nums[p - 1]) {
                p++;
                nums[p] = nums[i];
            }
        }
        return p + 1;
    }
}
