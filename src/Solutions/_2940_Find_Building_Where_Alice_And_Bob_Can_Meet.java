package Solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class _2940_Find_Building_Where_Alice_And_Bob_Can_Meet {

    public int[] leftmostBuildingQueries(int[] heights, int[][] queries) {

        List<List<List<Integer>>> storeQueries = new ArrayList<>(heights.length);
        for (int i = 0; i < heights.length; i++) storeQueries.add(new ArrayList<>());

        PriorityQueue<List<Integer>> maxIndex = new PriorityQueue<>((a, b) -> a.get(0) - b.get(0));

        int[] res = new int[queries.length];
        Arrays.fill(res, -1);

        for (int i = 0; i < queries.length; i++) {

            int a = queries[i][0], b = queries[i][1];
            if (a < b && heights[a] < heights[b])
                res[i] = b;
            else if (a > b && heights[a] > heights[b])
                res[i] = a;
            else if (a == b)
                res[i] = a;
            else {
                storeQueries
                        .get(Math.max(a, b))
                        .add(Arrays.asList(
                                Math.max(heights[a], heights[b]), i
                        ));
            }
        }

        for (int index = 0; index < heights.length; index++) {
            while (!maxIndex.isEmpty() && maxIndex.peek().get(0) < heights[index]) {
                res[maxIndex.peek().get(1)] = index;
                maxIndex.poll();
            }

            for (List<Integer> element : storeQueries.get(index)) {
                maxIndex.offer(element);
            }
        }

        return res;
    }
}
