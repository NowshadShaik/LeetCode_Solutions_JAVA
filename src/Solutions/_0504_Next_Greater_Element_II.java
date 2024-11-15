package Solutions;

import java.util.Arrays;
import java.util.Stack;

public class _0504_Next_Greater_Element_II {

    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        Arrays.fill(res, -1);

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < 2 * nums.length; i++) {
            int index = i % nums.length;
            while (!stack.isEmpty() && nums[stack.peek()] < nums[index]) {
                int a = stack.pop();
                res[a] = nums[index];
            }
            if (i < nums.length) {
                stack.push(index);
            }
        }
        return res;
    }
}
