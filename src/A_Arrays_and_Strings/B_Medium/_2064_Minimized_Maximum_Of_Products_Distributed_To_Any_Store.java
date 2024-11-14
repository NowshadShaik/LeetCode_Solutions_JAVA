package A_Arrays_and_Strings.B_Medium;

public class _2064_Minimized_Maximum_Of_Products_Distributed_To_Any_Store {

    public int minimizedMaximum(int n, int[] quantities) {
        int res = Integer.MAX_VALUE;

        int l = 1, r = 100000;
        while (l <= r) {
            int m = l + (r - l) / 2;
            int count = 0;
            for (int q : quantities) {
                count += (q + m - 1) / m;
            }

            if (count <= n) {
                res = Math.min(res, m);
                r = m - 1;
            } else l = m + 1;
        }
        return res;
    }
}
