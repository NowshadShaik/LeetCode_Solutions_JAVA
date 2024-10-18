package D_Binary_Search.B_Medium;

import java.util.Arrays;

public class _2300_Successful_Pairs_Of_Spells_And_Potions {

    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] res = new int[spells.length];

        for (int i = 0; i < spells.length; i++) {
            long required = (success + spells[i] - 1) / spells[i];
            int l = 0, r = potions.length - 1;
            while (l <= r) {
                int m = l + (r - l) / 2;
                if (potions[m] < required)
                    l = m + 1;
                else
                    r = m - 1;
            }
            res[i] = potions.length - l;
        }
        return res;
    }
}
