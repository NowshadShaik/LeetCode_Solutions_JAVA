package Solutions;

import java.util.HashMap;
import java.util.Map;

public class _0350_Intersection_Of_Arrays_II {

    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> freq = new HashMap<>();

        for(int n : nums1)
            freq.put(n, freq.getOrDefault(n, 0)+1);

        int[] res = new int[nums1.length];
        int r = 0;

        for(int n : nums2) {
            if(freq.containsKey(n) && freq.get(n) > 0) {
                res[r++] = n;
                freq.put(n, freq.get(n) - 1);
            }
        }

        int[] ans = new int[r];
        for(int i=0;i<r;i++) {
            ans[i] = res[i];
        }

        return ans;
    }
}
