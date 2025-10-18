package Solutions;

import java.util.Arrays;

public class _3397_Maximum_Number_of_Distinct_Element_After_Operations {

    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;

        int prevUsed = Integer.MIN_VALUE;
        for (int n : nums) {

            int curr = Math.min(Math.max(prevUsed + 1, n - k), n + k);
            if (curr > prevUsed) {
                count++;
                prevUsed = curr;
            }
        }

        return count;
    }
}
