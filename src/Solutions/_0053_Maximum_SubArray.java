package Solutions;

public class _0053_Maximum_SubArray {

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
