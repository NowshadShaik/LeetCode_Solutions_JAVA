package Solutions;

public class _1011_Capacity_To_Ship_Packages_WithIn_D_Days {

    public static void main(String[] args) {
        int[] weights = {3, 2, 2, 4, 1, 4};
        int days = 3;

        int res = shipWithinDays(weights, days);

    }

    public static int shipWithinDays(int[] weights, int days) {
        int l = 0, r = 0;
        for (int w : weights) {
            l = Math.max(l, w);
            r += w;
        }
        int res = r;

        while (l <= r) {
            int m = (l + r) / 2;

            int currDays = 1, currWeight = 0;
            for (int i = 0; i < weights.length; i++) {

                if (currWeight + weights[i] > m) {
                    currDays++;
                    if (currDays > days)
                        break;
                    currWeight = 0;
                }
                currWeight += weights[i];
            }

            if (currDays <= days) {
                res = Math.min(res, m);
                r = m - 1;
            } else {
                l = m + 1;
            }
        }

        return res;
    }
}
