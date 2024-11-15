package Solutions;

import java.util.*;

public class _0015_3Sum {

    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums); // -> NlogN
            Set<List<Integer>> ans = new HashSet<>();

            int n = nums.length;
            ;
            for (int i = 0; i < n - 2; i++) {
                int left = i + 1;
                int right = n - 1;
                while (left < right) {
                    int sum = nums[i] + nums[left] + nums[right];
                    if (sum == 0) {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[left]);
                        list.add(nums[right]);
                        ans.add(list);
                        left++;
                    } else if (sum < 0) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
            return new ArrayList<>(ans);
        }
    }
}