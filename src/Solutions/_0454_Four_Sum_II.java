package Solutions;

import java.util.HashMap;
import java.util.Map;

public class _0454_Four_Sum_II {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int res = 0;

        Map<Integer, Integer> map = new HashMap<>();
        for(int k : nums3) {
            for(int l : nums4) {
                map.merge(k+l, 1, (a,b) -> a+b);
            }
        }

        for(int i : nums1) {
            for(int j : nums2) {
                res += map.getOrDefault(-(i+j), 0);
            }
        }
        return res;
    }
}
