package A_Arrays_and_Strings.B_Medium;

import java.util.HashMap;
import java.util.Map;

public class _2588_Count_The_Number_Of_Beautiful_Subarrays {
    public long beautifulSubarrays(int[] nums) {
        long res = 0;
        int xor = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int n : nums) {
            xor ^= n;
            int temp = map.getOrDefault(xor, 0);
            res += (long) temp;
            map.put(xor, temp + 1);
        }
        return res;
    }
}
