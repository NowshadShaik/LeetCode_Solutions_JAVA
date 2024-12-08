package Solutions;

import java.util.Arrays;

public class _2054_Two_Best_Non_OverLapping_Events {

    public int maxTwoEvents(int[][] events) {
        int n = events.length;

        Arrays.sort(events, (a, b) -> a[0] - b[0]);

        int[] suffixMax = new int[n];
        suffixMax[n - 1] = events[n - 1][2];

        for (int i = n - 2; i >= 0; i--) {
            suffixMax[i] = Math.max(events[i][2], suffixMax[i + 1]);
        }

        int maxSum = 0;

        for (int i = 0; i < n; i++) {
            int left = i + 1, right = n - 1;
            int next = -1;

            while (left <= right) {
                int mid = (left + right) / 2;

                if (events[mid][0] > events[i][1]) {
                    next = mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }

            if (next != -1) {
                maxSum = Math.max(maxSum, events[i][2] + suffixMax[next]);
            }

            maxSum = Math.max(maxSum, events[i][2]);
        }

        return maxSum;
    }
}
