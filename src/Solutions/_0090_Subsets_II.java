package Solutions;

import java.util.*;

public class _0090_Subsets_II {

    Set<List<Integer>> res = new HashSet<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        traverse(nums, new ArrayList<>(), 0);
        return new ArrayList<>(res);
    }

    private void traverse(int[] nums, List<Integer> curr, int i) {
        if (i >= nums.length) {
            res.add(new ArrayList<>(curr));
            return;
        }

        curr.add(nums[i]);
        traverse(nums, curr, i + 1);
        curr.remove(curr.size() - 1);
        traverse(nums, curr, i + 1);
    }
}
