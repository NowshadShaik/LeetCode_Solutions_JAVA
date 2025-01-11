package Solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _0047_Permutations_II {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        for (int n : nums)
            counts.put(n, counts.getOrDefault(n, 0) + 1);

        backtrack(nums, new ArrayList<>(), counts);
        return res;
    }

    private void backtrack(int[] nums, List<Integer> curr, Map<Integer, Integer> counts) {
        if (curr.size() == nums.length) {
            res.add(new ArrayList<>(curr));
            return;
        }

        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (entry.getValue() > 0) {
                curr.add(entry.getKey());
                counts.put(entry.getKey(), entry.getValue() - 1);

                backtrack(nums, curr, counts);
                curr.remove(curr.size() - 1);
                counts.put(entry.getKey(), entry.getValue() + 1);
            }
        }
    }
}
