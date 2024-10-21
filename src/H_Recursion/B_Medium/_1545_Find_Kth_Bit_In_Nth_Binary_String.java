package H_Recursion.B_Medium;

public class _1545_Find_Kth_Bit_In_Nth_Binary_String {

    public char findKthBit(int n, int k) {
        if (n == 1) return '0';

        int length = (1 << n) - 1;
        int mid = length / 2 + 1;

        if (k == mid) return '1';
        if (k < mid) return findKthBit(n - 1, k);

        return findKthBit(n - 1, length - k + 1) == '0' ? '1' : '0';
    }
}
