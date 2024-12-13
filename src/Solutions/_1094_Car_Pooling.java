package Solutions;

public class _1094_Car_Pooling {

    public boolean carPooling(int[][] trips, int capacity) {
        int[] locations = new int[1001];

        for (int[] trip : trips) {
            locations[trip[1]] += trip[0];
            locations[trip[2]] -= trip[0];
        }

        int curr = 0;

        for (int i = 0; i <= 1000; i++) {
            curr += locations[i];
            if (curr > capacity)
                return false;
        }

        return true;
    }
}
