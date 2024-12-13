package Solutions;

public class _1049_Last_Stone_Weight_II {

    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for (int s : stones) sum += s;

        int s2 = 0;
        int n = stones.length;

        boolean[][] dp = new boolean[sum / 2 + 1][n + 1];

        for (int i = 0; i <= n; i++)
            dp[0][i] = true;

        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= sum / 2; s++) {
                if (dp[s][i - 1] || (s >= stones[i - 1] && dp[s - stones[i - 1]][i - 1])) {
                    dp[s][i] = true;
                    s2 = Math.max(s, s2);
                }
            }
        }

        return sum - 2 * s2;
    }
}
