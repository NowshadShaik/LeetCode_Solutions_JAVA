package Solutions;

import java.util.HashMap;
import java.util.Map;

public class _3160_Find_Number_of_Distinct_Colors_Among_Balls {

    public int[] queryResults(int limit, int[][] queries) {
        Map<Integer, Integer> colorGroups = new HashMap<>();
        Map<Integer, Integer> ballColors = new HashMap<>();

        int[] res = new int[queries.length];
        int r = 0;
        for (int[] query : queries) {
            if (ballColors.containsKey(query[0])) {
                int currColor = ballColors.get(query[0]);
                colorGroups.put(currColor, colorGroups.get(currColor) - 1);

                if (colorGroups.get(currColor) == 0)
                    colorGroups.remove(currColor);

            }


            colorGroups.put(query[1], colorGroups.getOrDefault(query[1], 0) + 1);

            ballColors.put(query[0], query[1]);

            res[r++] = colorGroups.size();
        }

        return res;
    }
}
