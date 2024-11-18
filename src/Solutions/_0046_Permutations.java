package Solutions;

import java.util.ArrayList;
import java.util.List;

public class _0046_Permutations {

    List<List<Integer>> res;
    public List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<List<Integer>>();
        List<Integer> curr = new ArrayList<>();
        permutations(nums, curr, new boolean[nums.length]);
        return res;
    }

    private void permutations(int[] nums, List<Integer> curr, boolean[] pick) {
        if(curr.size()==nums.length) {
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int i=0;i<nums.length;i++) {
            if(!pick[i]) {
                curr.add(nums[i]);
                pick[i] = true;

                permutations(nums, curr, pick);
                curr.remove(curr.size()-1);
                pick[i] = false;
            }
        }
    }
}
