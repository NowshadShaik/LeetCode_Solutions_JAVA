package Solutions;

import java.util.ArrayList;
import java.util.List;

public class _2200_Find_All_Distant_Indices_In_an_Array {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> res = new ArrayList<>();
        int l = 0, r = 0, n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] == key) {
                l = Math.max(r, i - k);
                r = Math.min(n - 1, i + k) + 1;
                for (int j = l; j < r; j++)
                    res.add(j);
            }
        }

        return res;
    }
}
