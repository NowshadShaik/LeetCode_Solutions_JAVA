package A_Arrays.A_Easy;

public class _0121_Best_Time_To_Buy_And_Sell_Stock {
    public static void main(String[] args) {
        // Create an instance of the Solution class
        Solution solution = new Solution();

        // Test case 1: prices = [7, 1, 5, 3, 6, 4]
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int maxProfit1 = solution.maxProfit(prices1);
        System.out.println("Max profit for prices [7, 1, 5, 3, 6, 4]: " + maxProfit1);
        // Expected output: 5 (Buy at price 1, sell at price 6 for a profit of 6 - 1 = 5)

        // Test case 2: prices = [7, 6, 4, 3, 1]
        int[] prices2 = {7, 6, 4, 3, 1};
        int maxProfit2 = solution.maxProfit(prices2);
        System.out.println("Max profit for prices [7, 6, 4, 3, 1]: " + maxProfit2);
        // Expected output: 0 (No profitable transaction is possible)

        // Test case 3: prices = [2, 4, 1]
        int[] prices3 = {2, 4, 1};
        int maxProfit3 = solution.maxProfit(prices3);
        System.out.println("Max profit for prices [2, 4, 1]: " + maxProfit3);
        // Expected output: 2 (Buy at price 2, sell at price 4 for a profit of 4 - 2 = 2)
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        // Initialize the maximum profit to 0
        int profit = 0;
        // Initialize the minimum price to the first price in the array
        int minPrice = prices[0];

        // Iterate over the prices starting from the second price
        for (int i = 1; i < prices.length; i++) {
            // Get the current price
            int currentPrice = prices[i];

            // Check if the current price is lower than the minimum price encountered so far
            if (currentPrice < minPrice) {
                // Update the minimum price to the current price
                minPrice = currentPrice;
            }
            // Check if the difference between the current price and the minimum price is greater than the current profit
            else if (currentPrice - minPrice > profit) {
                // Update the profit to the new maximum difference
                profit = currentPrice - minPrice;
            }
        }

        // Return the maximum profit
        return profit;
    }
}

