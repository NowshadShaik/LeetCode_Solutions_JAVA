package Solutions;

public class _2554_Maximum_Number_Of_Integers_To_Choose_From_A_Range_I {

    public int maxCount(int[] banned, int n, int maxSum) {
        boolean[] arr = new boolean[n + 1];

        for (int b : banned) {
            if (b <= n) arr[b] = true;
        }

        int res = 0;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (!arr[i] && sum + i <= maxSum) {
                sum += i;
                res++;
            }
        }
        return res;
    }
}
