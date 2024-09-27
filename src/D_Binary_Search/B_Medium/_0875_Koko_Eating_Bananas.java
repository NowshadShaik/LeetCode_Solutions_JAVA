package D_Binary_Search.B_Medium;

import java.util.Arrays;

public class _0875_Koko_Eating_Bananas {

    public int minEatingSpeed(int[] piles, int h) {

        int l = 1, r = Arrays.stream(piles).max().getAsInt();
        int ans = r;
        while (l <= r) {
            int m = (l + r) / 2;
            int hoursTaken = 0;
            for (int i = 0; i < piles.length; i++) {
                hoursTaken += Math.ceil((double) piles[i] / m);
            }
            if (hoursTaken <= h) {
                r = m - 1;
                ans = m;
            } else {
                l = m + 1;
            }
        }
        return ans;
    }
}
