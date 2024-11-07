package A_Arrays_and_Strings.B_Medium;

public class _2275_Largest_Combination_With_Bitwise_AND_Greater_Than_Zero {

    public int largestCombination(int[] candidates) {
        int[] count = new int[32];

        for (int n : candidates) {
            int i = 0;
            while (n > 0) {
                count[i] += n & 1;
                i++;
                n = n >> 1;
            }
        }

        int res = 0;
        for (int c : count) {
            res = Math.max(c, res);
        }
        return res;
    }
}
