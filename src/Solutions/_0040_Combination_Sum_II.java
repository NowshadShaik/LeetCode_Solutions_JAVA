package Solutions;

import java.util.*;

public class _0040_Combination_Sum_II {

    Set<List<Integer>> res;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        res = new HashSet<>();
        subset(candidates, target, new ArrayList<>(), 0);
        return new ArrayList<>(res);
    }

    private void subset(int[] candidates, int target, List<Integer> curr, int i) {
        if(target == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }

        if(i>=candidates.length || target < 0) return;

        curr.add(candidates[i]);
        subset(candidates, target - candidates[i], curr, i+1);
        curr.remove(curr.size() - 1);

        while(i+1 < candidates.length && candidates[i] == candidates[i+1]) i++;
        subset(candidates, target, curr, i+1);

    }
}
