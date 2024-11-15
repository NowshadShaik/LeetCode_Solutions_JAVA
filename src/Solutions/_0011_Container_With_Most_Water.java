package Solutions;

public class _0011_Container_With_Most_Water {

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