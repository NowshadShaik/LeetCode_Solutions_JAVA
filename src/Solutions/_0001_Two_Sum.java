package Solutions;

import java.util.Map;
import java.util.HashMap;

public class _0001_Two_Sum {

    class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> values = new HashMap<>();
            int[] ans = new int[2];

            for (int i = 0; i < nums.length; i++) {
                int expected = target - nums[i];
                if (values.containsKey(expected)) {
                    ans[0] = values.get(expected);
                    ans[1] = i;
                    return ans;
                } else {
                    values.put(nums[i], i);
                }
            }
            return ans;
        }
    }
}
