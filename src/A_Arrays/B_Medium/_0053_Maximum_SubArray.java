package A_Arrays.B_Medium;

public class _0053_Maximum_SubArray {

    public static void main(String[] args) {
        Solution0053 solution0053 = new Solution0053();

        // Test Case 1
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result1 = solution0053.maxSubArray(nums1);
        System.out.println("Maximum subArray sum: " + result1);  // Expected output: 6

        // Test Case 2
        int[] nums2 = {1, -2, 3, -4, 5, -6, 7};
        int result2 = solution0053.maxSubArray(nums2);
        System.out.println("Maximum subArray sum: " + result2);  // Expected output: 7

        // Test Case 3
        int[] nums3 = {-1, -2, -3, -4, -5};
        int result3 = solution0053.maxSubArray(nums3);
        System.out.println("Maximum subArray sum: " + result3);  // Expected output: -1
    }
}

class Solution0053 {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE; // Initialize the maximum sum as the smallest possible value
        int sum = 0; // Initialize the current sum as 0

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i]; // Add the current number to the sum

            max = Math.max(max, sum); // Update the maximum sum if the current sum is greater

            if (sum < 0) {
                sum = 0; // If the sum becomes negative, reset it to 0 to start a new subarray
            }
        }

        return max; // Return the maximum sum
    }
}
