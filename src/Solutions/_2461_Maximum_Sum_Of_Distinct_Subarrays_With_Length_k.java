package Solutions;

import java.util.HashMap;
import java.util.Map;

public class _2461_Maximum_Sum_Of_Distinct_Subarrays_With_Length_k {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 5, 4, 2, 9, 9, 9};
        int k = 3;
        long ans = maximumSubarraySum(arr, k);
        System.out.println(ans);

    }

    private static long maximumSubarraySum(int[] nums, int k) {
        long res = 0;
        Map<Integer, Integer> map = new HashMap<>();

        long curr = 0;
        int l = 0;

        for(int r=0;r<nums.length;r++) {
            curr += nums[r];
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);

            if(r-l+1 > k) {
                if (map.get(nums[l]) > 1) {
                    map.put(nums[l], map.get(nums[l]) - 1);
                } else {
                    map.remove(nums[l]);
                }
                curr -= nums[l++];
            }

            if(map.size() == r-l+1 && r-l+1 == k) {
                res = Math.max(res, curr);
            }
        }
        return res;
    }
}
