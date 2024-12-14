package Solutions;

import java.util.TreeMap;

public class _2762_Continuous_Subarray {

    public long continuousSubarrays(int[] nums) {
        TreeMap<Integer, Integer> freq = new TreeMap<>();

        int l = 0, r = 0, n = nums.length;
        long count = 0;

        while(r<n) {
            freq.put(nums[r], freq.getOrDefault(nums[r], 0) + 1);

            while(freq.lastEntry().getKey() - freq.firstEntry().getKey() > 2) {
                freq.put(nums[l], freq.get(nums[l]) - 1);

                if(freq.get(nums[l]) == 0) {
                    freq.remove(nums[l]);
                }
                l++;
            }

            count += r - l + 1;
            r++;
        }

        return count;
    }
}
