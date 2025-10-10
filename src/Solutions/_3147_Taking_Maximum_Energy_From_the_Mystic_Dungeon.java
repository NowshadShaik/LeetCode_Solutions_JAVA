package Solutions;

public class _3147_Taking_Maximum_Energy_From_the_Mystic_Dungeon {

    public int maximumEnergy(int[] energy, int k) {
        int res = Integer.MIN_VALUE;

        for (int i = energy.length - 1; i > energy.length - 1 - k; i--) {
            int curr = 0;
            int j = i;

            while (j >= 0) {
                curr += energy[j];
                res = Math.max(res, curr);
                j -= k;
            }
        }

        return res;
    }
}
