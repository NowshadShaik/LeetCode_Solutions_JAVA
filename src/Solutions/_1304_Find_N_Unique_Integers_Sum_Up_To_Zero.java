package Solutions;

public class _1304_Find_N_Unique_Integers_Sum_Up_To_Zero {

    public int[] sumZero(int n) {
        int[] res = new int[n];

        int r = 0;
        if ((n % 2) != 0)
            res[r++] = 0;

        for (int i = 1; i <= n / 2; i++) {
            res[r++] = i;
            res[r++] = i * -1;
        }

        return res;
    }
}
