package Solutions;

public class _2425_Bitwise_XOR_Of_All_Pairings {

    public int xorAllNums(int[] nums1, int[] nums2) {
        int xor1 = 0;
        int xor2 = 0;

        int l1 = nums1.length;
        int l2 = nums2.length;

        if (l2 % 2 != 0) {
            for (int n : nums1)
                xor1 ^= n;
        }

        if (l1 % 2 != 0) {
            for (int n : nums2)
                xor2 ^= n;
        }

        return xor1 ^ xor2;
    }
}
