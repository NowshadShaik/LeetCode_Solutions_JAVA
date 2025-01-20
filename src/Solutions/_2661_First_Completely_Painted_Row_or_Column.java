package Solutions;

import java.util.HashMap;
import java.util.Map;

public class _2661_First_Completely_Painted_Row_or_Column {

    public int firstCompleteIndex(int[] arr, int[][] mat) {
        Map<Integer, int[]> map = new HashMap<>();
        int m = mat.length;
        int n = mat[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                map.put(mat[i][j], new int[]{i, j});
            }
        }

        int[] rows = new int[m];
        int[] cols = new int[n];

        for (int i = 0; i < arr.length; i++) {

            int[] loc = map.get(arr[i]);
            rows[loc[0]]++;
            cols[loc[1]]++;

            if (rows[loc[0]] == n || cols[loc[1]] == m)
                return i;
        }

        return -1;
    }
}
