package B_Two_Pointers.B_Medium;

public class _0011_Container_With_Most_Water {

    public static void main(String[] args) {
        // Create an instance of the Solution class
        Solution0011 solution = new Solution0011();

        // Test case: height = [1, 8, 6, 2, 5, 4, 8, 3, 7]
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int maxArea = solution.maxArea(height);
        System.out.println("Max area for height [1, 8, 6, 2, 5, 4, 8, 3, 7]: " + maxArea);
        // Expected output: 49 (The maximum area is achieved by selecting the heights 8 and 7, with a width of 7 - 2 = 5. The area is 5 * 7 = 35)

    }
}

class Solution0011 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        // Continue the loop until the pointers meet or cross each other
        while (left < right) {
            // Calculate the width as the difference between the right and left pointers
            int width = right - left;
            // Calculate the height as the minimum value between the heights at the left and right pointers
            int minHeight = Math.min(height[left], height[right]);

            // Calculate the current area using width and minHeight, and update maxArea if necessary
            maxArea = Math.max(width * minHeight, maxArea);

            // Move the pointer that corresponds to the smaller height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        // Return the maximum area
        return maxArea;
    }
}