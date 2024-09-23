package A_Arrays_and_Strings.B_Medium;

public class _0152_Maximum_Product_SubArray {
    public static void main(String[] args) {
        Solution0152 Solution0152 = new Solution0152();

        int[] nums = {2, 3, -2, 4, -1};
        int maxProduct = Solution0152.maxProduct(nums);
        System.out.println("Maximum Product: " + maxProduct);
        // Output: Maximum Product: 48
    }
}

class Solution0152 {
    public int maxProduct(int[] nums) {
        int max = nums[0];         // Variable to store the maximum product
        int currMax = nums[0];     // Variable to store the current maximum product
        int currMin = nums[0];     // Variable to store the current minimum product

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];    // Current number

            // Calculate the temporary maximum and minimum products
            int tmpMax = Math.max(Math.max(currMax * num, currMin * num), num);
            int tmpMin = Math.min(Math.min(currMax * num, currMin * num), num);

            max = Math.max(max, tmpMax);   // Update the maximum product

            // Update the current maximum and minimum products for the next iteration
            currMax = tmpMax;
            currMin = tmpMin;
        }

        return max;   // Return the maximum product of a contiguous subArray
    }
}

