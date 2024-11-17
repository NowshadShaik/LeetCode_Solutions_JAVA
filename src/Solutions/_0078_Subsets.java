package Solutions;

import java.util.ArrayList;
import java.util.List;

public class _0078_Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        traverse(nums, res, 0, new ArrayList<Integer>());
        return res;
    }

    private void traverse(int[] nums, List<List<Integer>> res, int i, List<Integer> subset) {
        if(i >= nums.length) {
            res.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[i]);
        traverse(nums, res, i + 1, subset);
        subset.remove(subset.size()-1);
        traverse(nums, res, i+1, subset);
    }
}
