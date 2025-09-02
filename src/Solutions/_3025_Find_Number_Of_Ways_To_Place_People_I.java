package Solutions;

public class _3025_Find_Number_Of_Ways_To_Place_People_I {

    public int numberOfPairs(int[][] points) {
        int n = points.length;
        int res = 0;

        for (int i = 0; i < n; i++) {
            int[] pointA = points[i];

            for (int j = 0; j < n; j++) {
                int[] pointB = points[j];

                if (i == j || !(pointA[0] <= pointB[0] && pointA[1] >= pointB[1]))
                    continue;

                if (n == 2) {
                    res++;
                    continue;
                }

                boolean illegal = false;
                for (int k = 0; k < n; k++) {
                    if (k == i || k == j)
                        continue;

                    int[] pointTmp = points[k];
                    boolean isXContained = pointTmp[0] >= pointA[0] && pointTmp[0] <= pointB[0];
                    boolean isYContained = pointTmp[1] <= pointA[1] && pointTmp[1] >= pointB[1];
                    if (isXContained && isYContained) {
                        illegal = true;
                        break;
                    }
                }

                if (!illegal)
                    res++;

            }
        }

        return res;
    }
}
