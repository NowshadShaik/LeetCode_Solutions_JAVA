package A_Arrays_and_Strings.B_Medium;

public class _3011_Find_If_Array_Can_Be_Sorted {

    public boolean canSortArray(int[] nums) {
        int currMin = nums[0];
        int currMax = nums[0];
        int prevMax = Integer.MIN_VALUE;

        for (int n : nums) {
            if (Integer.bitCount(n) == Integer.bitCount(currMin)) {
                currMin = Math.min(currMin, n);
                currMax = Math.max(currMax, n);
            } else {
                if (currMin < prevMax) {
                    return false;
                }
                prevMax = currMax;
                currMax = n;
                currMin = n;
            }
        }
        if (currMin < prevMax) return false;
        return true;
    }
}
