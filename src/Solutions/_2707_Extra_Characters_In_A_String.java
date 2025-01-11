package Solutions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class _2707_Extra_Characters_In_A_String {

    Set<String> set;
    int res;
    int[] dp;

    public int minExtraChar(String s, String[] dictionary) {
        set = new HashSet<>();
        for (String word : dictionary)
            set.add(word);

        dp = new int[s.length() + 1];
        Arrays.fill(dp, -1);
        dp[s.length()] = 0;

        return dfs(0, s);
    }

    private int dfs(int i, String s) {
        if (dp[i] != -1)
            return dp[i];

        res = 1 + dfs(i + 1, s);
        for (int j = i; j < s.length(); j++) {
            if (set.contains(s.substring(i, j + 1))) {
                res = Math.min(res, dfs(j + 1, s));
            }
        }
        dp[i] = res;
        return res;
    }
}
