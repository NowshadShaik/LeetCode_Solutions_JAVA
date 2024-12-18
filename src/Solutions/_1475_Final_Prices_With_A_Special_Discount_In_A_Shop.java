package Solutions;

import java.util.Stack;

public class _1475_Final_Prices_With_A_Special_Discount_In_A_Shop {

    public int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int n = prices.length;
        stack.push(0);

        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                prices[stack.pop()] -= prices[i];
            }
            stack.push(i);
        }

        return prices;
    }
}
