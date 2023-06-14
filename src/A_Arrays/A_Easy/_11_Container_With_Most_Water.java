package A_Arrays.A_Easy;

class Solution {
    public int maxArea(int[] height) {
        int maxArea=0;
        int left = 0;
        int right = height.length-1;
        while (left < right) {
            int l = right-left;
            int h = Math.min(height[left],height[right]);
            maxArea = Math.max(maxArea, (l*h));
            if(height[left]<=height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}