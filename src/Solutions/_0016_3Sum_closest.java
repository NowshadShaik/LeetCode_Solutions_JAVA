package Solutions;

import java.util.Arrays;

public class _0016_3Sum_closest {

    public int threeSumClosest(int[] nums, int target) {
        int closest = Integer.MAX_VALUE;
        Arrays.sort(nums);

        for(int i=0;i<nums.length-2;i++) {
            int l = i+1, r = nums.length-1;

            while(l<r) {
                int curr = nums[i] + nums[l] + nums[r];

                if(curr < target) l++;
                else r--;

                if(closest == Integer.MAX_VALUE) {
                    closest = curr;
                } else if (Math.abs(target-curr) < Math.abs(target-closest)) {
                    closest = curr;
                }
            }
        }
        return closest == Integer.MAX_VALUE ? 0 : closest;
    }
}
