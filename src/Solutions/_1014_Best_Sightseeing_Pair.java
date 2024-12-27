package Solutions;

public class _1014_Best_Sightseeing_Pair {

    public int maxScoreSightseeingPair(int[] values) {
        int m = values[0];
        int res = 0;
        for (int i = 1; i < values.length; i++) {
            if (m + values[i] - i > res)
                res = m + values[i] - i;

            if (values[i] + i > m)
                m = values[i] + i;
        }
        return res;
    }
}
