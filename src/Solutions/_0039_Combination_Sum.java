package Solutions;

import java.util.ArrayList;
import java.util.List;

public class _0039_Combination_Sum {

    List<List<Integer>> res;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        res = new ArrayList<List<Integer>>();
        List<Integer> curr = new ArrayList<>();
        backTrack(candidates, target, curr, 0);
        return res;
    }

    private void backTrack(int[] candidates, int target, List<Integer> curr, int i) {

        if (target == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }

        if (i >= candidates.length || target < 0) return;

        curr.add(candidates[i]);
        backTrack(candidates, target - candidates[i], curr, i);
        curr.remove(curr.size() - 1);
        backTrack(candidates, target, curr, i + 1);
    }
}
