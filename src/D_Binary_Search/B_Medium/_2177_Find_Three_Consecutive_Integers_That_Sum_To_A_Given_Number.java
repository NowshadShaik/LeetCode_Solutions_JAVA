package D_Binary_Search.B_Medium;

public class _2177_Find_Three_Consecutive_Integers_That_Sum_To_A_Given_Number {

    public long[] sumOfThree(long num) {
        if (num == 0) return new long[]{-1, 0, 1};
        long l = 0, r = num;
        while (l <= r) {
            long m = (l + r) / 2;
            long value = m + m + m + 1 + 2;
            if (value == num) {
                long[] ans = new long[]{m, m + 1, m + 2};
                return ans;
            } else if (value < num) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return new long[0];
    }
}
