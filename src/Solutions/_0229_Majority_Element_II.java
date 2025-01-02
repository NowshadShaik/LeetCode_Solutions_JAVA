package Solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _0229_Majority_Element_II {

    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);

            if (map.size() > 2) {
                Map<Integer, Integer> newCount = new HashMap<>();
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if (entry.getValue() > 1) {
                        newCount.put(entry.getKey(), entry.getValue() - 1);
                    }
                }
                map = newCount;
            }
        }

        List<Integer> res = new ArrayList<>();
        for (int key : map.keySet()) {
            int freq = 0;
            for (int num : nums) {
                if (num == key) freq++;
            }
            if (freq > nums.length / 3)
                res.add(key);
        }
        return res;
    }
}
