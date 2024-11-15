package Solutions;

import java.util.Stack;

public class _0735_Astroid_Collision {

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int i : asteroids) {
            if (i > 0) {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(i)) {
                    stack.pop();
                }

                if (!stack.isEmpty() && stack.peek() == Math.abs(i)) {
                    stack.pop();
                } else if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(i);
                }
            }
        }

        int[] res = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            res[i] = stack.get(i);
        }

        return res;
    }
}
