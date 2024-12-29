package Solutions;

import java.util.ArrayList;
import java.util.List;

public class _0448_Find_All_Numbers_Disappeared_In_An_Array {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();

        for (int n : nums) {
            int i = Math.abs(n) - 1;
            nums[i] = -1 * Math.abs(nums[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                res.add(i + 1);
        }

        return res;
    }
}
