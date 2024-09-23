package A_Arrays_and_Strings.C_Hard;

public class _0042_Trapping_Rain_Water {
    public static void main(String[] args) {
        // Create an instance of the Solution class
        Solution solution = new Solution();

        // Test case: height = [0,1,0,2,1,0,1,3,2,1,2,1]
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int trappedWater = solution.trap(height);
        System.out.println("Trapped water for height [0,1,0,2,1,0,1,3,2,1,2,1]: " + trappedWater);
        // Expected output: 6 (The height array represents a series of bars, and the trapped water is calculated based on the bar heights. In this case, there are 6 units of water trapped between the bars.)
    }
}
class Solution {
    public int trap(int[] height) {
        // Check if the height array is empty
        if (height.length == 0) {
            return 0;
        }

        // Initialize the left and right pointers
        int left = 0;
        int right = height.length - 1;

        // Initialize the maximum height on the left and right sides
        int maxL = height[left];
        int maxR = height[right];

        // Initialize the result variable to store the trapped water amount
        int result = 0;

        // Loop until the left and right pointers meet or cross each other
        while (left < right) {
            // Compare the maximum heights on the left and right sides
            if (maxL < maxR) {
                // Move the left pointer to the next position
                left++;
                // Update the maximum height on the left side if necessary
                maxL = Math.max(maxL, height[left]);
                // Calculate the amount of water trapped between the current position and the maximum height on the left side
                result += maxL - height[left];
            } else {
                // Move the right pointer to the previous position
                right--;
                // Update the maximum height on the right side if necessary
                maxR = Math.max(maxR, height[right]);
                // Calculate the amount of water trapped between the current position and the maximum height on the right side
                result += maxR - height[right];
            }
        }

        // Return the total amount of trapped water
        return result;
    }
}