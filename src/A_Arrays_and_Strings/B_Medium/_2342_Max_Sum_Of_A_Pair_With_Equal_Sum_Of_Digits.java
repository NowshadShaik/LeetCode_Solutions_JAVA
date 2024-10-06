package A_Arrays_and_Strings.B_Medium;

import java.util.HashMap;
import java.util.Map;

public class _2342_Max_Sum_Of_A_Pair_With_Equal_Sum_Of_Digits {

    public int maximumSum(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = -1;

        for (int i = 0; i < nums.length; i++) {
            int currSum = sumOfDigits(nums[i]);
            if (map.containsKey(currSum)) {
                int prev = map.get(currSum);
                max = Math.max(max, prev + nums[i]);
                map.put(currSum, Math.max(prev, nums[i]));
            } else {
                map.put(currSum, nums[i]);
            }
        }
        return max;
    }

    private int sumOfDigits(int a) {
        int res = 0;
        while (a > 0) {
            res += a % 10;
            a = a / 10;
        }
        return res;
    }
}
