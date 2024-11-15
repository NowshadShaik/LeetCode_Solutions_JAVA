package Solutions;

import java.util.Stack;

public class _0962_Maximum_Width_Ramp {

    public int maxWidthRamp(int[] nums) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < nums.length; i++) {
            if (!stack.isEmpty()) {
                if (nums[i] < nums[stack.peek()]) {
                    stack.push(i);
                }
            } else {
                stack.push(i);
            }
        }
        int maxWidth = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
                maxWidth = Math.max(maxWidth, i - stack.pop());
            }
        }
        return maxWidth;
    }
}
