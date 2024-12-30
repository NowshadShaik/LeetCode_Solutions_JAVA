package Solutions;

import java.util.Arrays;

public class _2466_Count_Ways_To_Build_Good_Strings {
    public static int L, H, Z, O, MOD;
    private static int dp[];

    public int countGoodStrings(int low, int high, int zero, int one) {
        this.L = low;
        this.H = high;
        this.Z = zero;
        this.O = one;
        this.MOD = (int) 1e9 + 7;
        dp = new int[high + 1];
        Arrays.fill(dp, -1);

        return dfs(0);
    }

    private int dfs(int length) {
        if (length > H)
            return 0;

        if (dp[length] != -1)
            return dp[length];

        int count = 0;
        if (length >= L)
            count++;

        count += dfs(length + Z) + dfs(length + O);
        return dp[length] = count % MOD;
    }
}
