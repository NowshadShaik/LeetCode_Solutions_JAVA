package Solutions;


public class _2239_Find_Closest_Number_to_Zero {

    class Solution {
        public int findClosestNumber(int[] nums) {
            int closest = nums[0];
            for(int n : nums) {
                if(Math.abs(n)<Math.abs(closest) || n == Math.abs(closest)) {
                    closest = n;
                }
            }
            return closest;
        }
    }
}