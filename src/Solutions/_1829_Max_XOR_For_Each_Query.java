package Solutions;

public class _1829_Max_XOR_For_Each_Query {

    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length;
        int xor = nums[0];
        int maxXor = (1 << maximumBit) - 1;

        for (int i = 1; i < n; i++) xor ^= nums[i];

        int res[] = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = xor ^ maxXor;
            xor ^= nums[n - 1 - i];
        }
        return res;
    }
}
