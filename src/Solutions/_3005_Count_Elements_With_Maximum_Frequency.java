package Solutions;

import java.util.HashMap;
import java.util.Map;

public class _3005_Count_Elements_With_Maximum_Frequency {

    public int maxFrequencyElements(int[] nums) {

        Map<Integer, Integer> freqMap = new HashMap<>();

        int res = 0;
        int maxFreq = 0;
        for (int n : nums) {
            int currFreq = freqMap.getOrDefault(n, 0) + 1;
            freqMap.put(n, currFreq);

            if (currFreq > maxFreq) {
                maxFreq = currFreq;
                res = maxFreq;
            } else if (currFreq == maxFreq) {
                res += currFreq;
            }
        }

        return res;
    }
}
