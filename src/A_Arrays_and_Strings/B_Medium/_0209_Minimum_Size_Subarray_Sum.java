package A_Arrays_and_Strings.B_Medium;

public class _0209_Minimum_Size_Subarray_Sum {
    public static void main(String[] args) {
        Solution0209 solution = new Solution0209();

        // Test case 1
        int target1 = 7;
        int[] nums1 = {2, 3, 1, 2, 4, 3};
        int result1 = solution.minSubArrayLen(target1, nums1);
        System.out.println("Minimum subarray length for target " + target1 + ": " + result1);

        // Test case 2
        int target2 = 11;
        int[] nums2 = {1, 2, 3, 4, 5};
        int result2 = solution.minSubArrayLen(target2, nums2);
        System.out.println("Minimum subarray length for target " + target2 + ": " + result2);
    }
}
class Solution0209 {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0; // Left pointer of the sliding window
        int res=Integer.MAX_VALUE,sum=0; // Initialize result and sum variables

        for(int r=0;r<nums.length;r++) { // Iterate through the array using the right pointer
            sum+=nums[r]; // Add the current element to the sum

            while(sum>=target) { // Shrink the window if the sum is greater than or equal to the target
                res = Math.min(r-l+1,res); // Update the result with the minimum length of the subarray
                sum-=nums[l++]; // Subtract the value at the left pointer from the sum and move the left pointer to the right
            }
        }
        return res == Integer.MAX_VALUE ? 0 : res; // Return the minimum length or 0 if no valid subarray is found
    }
}
