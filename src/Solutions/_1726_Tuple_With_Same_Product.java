package Solutions;

import java.util.HashMap;
import java.util.Map;

public class _1726_Tuple_With_Same_Product {

    public int tupleSameProduct(int[] nums) {
        Map<Integer, Integer> products = new HashMap<>();
        int totalTuples = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                products.put(nums[i] * nums[j], products.getOrDefault(nums[i] * nums[j], 0) + 1);
            }
        }

        for (int i : products.keySet()) {
            int freq = products.get(i);

            int pairs = ((freq - 1) * freq) / 2;

            totalTuples += 8 * pairs;
        }

        return totalTuples;
    }
}
