package A_Arrays.A_Easy;

import java.util.HashMap;
import java.util.Map;

public class _0217_Contains_Duplicates {

    class Solution {
        public boolean containsDuplicates(int[] nums) {
            Map<Integer, Integer> values = new HashMap<>();

            for (int i = 0; i < nums.length; i++) {
                if (values.containsKey(nums[i])) {
                    return true;
                } else {
                    values.put(nums[i], i);
                }
            }
            return false;
        }
    }

}
