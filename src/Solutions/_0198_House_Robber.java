package Solutions;

public class _0198_House_Robber {

    public int rob(int[] nums) {
        int rob1 = 0;
        int rob2 = 0;

        for (int n : nums) {
            int max = Math.max(rob1 + n, rob2);
            rob1 = rob2;
            rob2 = max;
        }

        return rob2;
    }
}
