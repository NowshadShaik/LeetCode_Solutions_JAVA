package Solutions;

import java.util.HashMap;
import java.util.Map;

public class _2364_Count_Number_of_Bad_Pairs {

    public long countBadPairs(int[] nums) {
        long res = 0;
        Map<Integer, Integer> diffCount = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int curr = i - nums[i];

            int good = diffCount.getOrDefault(curr, 0);

            res += i - good;

            diffCount.put(curr, good + 1);
        }

        return res;
    }
}
