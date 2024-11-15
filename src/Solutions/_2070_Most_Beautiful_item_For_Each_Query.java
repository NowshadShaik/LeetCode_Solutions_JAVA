package Solutions;

import java.util.Arrays;

public class _2070_Most_Beautiful_item_For_Each_Query {

    public int[] maximumBeauty(int[][] items, int[] queries) {
        int[] res = new int[queries.length];

        Arrays.sort(items, (a, b) -> a[0] - b[0]);
        int max = items[0][1];
        for (int i = 0; i < items.length; i++) {
            max = Math.max(max, items[i][1]);
            items[i][1] = max;
        }

        for (int i = 0; i < queries.length; i++) {
            int target = queries[i];
            int l = 0, r = items.length - 1;
            int maxBeauty = 0;
            while (l <= r) {
                int m = l + (r - l) / 2;
                if (items[m][0] > target) r = m - 1;
                else {
                    maxBeauty = Math.max(maxBeauty, items[m][1]);
                    l = m + 1;
                }
            }
            res[i] = maxBeauty;
        }

        return res;
    }
}
