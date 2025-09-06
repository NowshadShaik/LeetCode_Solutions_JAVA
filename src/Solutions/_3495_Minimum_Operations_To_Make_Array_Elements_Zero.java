package Solutions;

public class _3495_Minimum_Operations_To_Make_Array_Elements_Zero {

    public long minOperations(int[][] queries) {
        long res = 0;

        for (int[] query : queries) {
            int l = query[0];
            int r = query[1];

            long steps = solve(l, r);

            res += (steps + 1) / 2;
        }

        return res;
    }

    private long solve(int l, int r) {
        long steps = 0;

        long L = 1;
        long s = 1;

        while (L <= r) {
            long R = L * 4 - 1;

            long start = Math.max(L, l);
            long end = Math.min(R, r);

            if (start <= end) {
                steps += (end - start + 1) * s;
            }

            s++;
            L = L * 4;
        }

        return steps;
    }
}
