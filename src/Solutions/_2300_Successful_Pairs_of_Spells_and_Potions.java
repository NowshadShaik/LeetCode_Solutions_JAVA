package Solutions;

import java.util.Arrays;

public class _2300_Successful_Pairs_of_Spells_and_Potions {

    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] res = new int[spells.length];
        Arrays.sort(potions);

        for (int i = 0; i < spells.length; i++) {
            double req = Math.ceil((double) success / spells[i]);

            int loc = binSearch(potions, req);
            res[i] = potions.length - loc;
        }

        return res;
    }

    private int binSearch(int[] potions, double req) {
        int l = 0, r = potions.length - 1;

        while (l < r) {
            int m = l + (r - l) / 2;

            if (potions[m] >= req) {
                r = m;
            } else {
                l = m + 1;
            }
        }

        return potions[r] >= req ? r : potions.length;
    }
}
