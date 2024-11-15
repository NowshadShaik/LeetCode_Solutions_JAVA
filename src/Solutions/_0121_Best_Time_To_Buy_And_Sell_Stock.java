package Solutions;

public class _0121_Best_Time_To_Buy_And_Sell_Stock {

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

