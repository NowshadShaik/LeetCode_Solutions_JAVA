package Solutions;

import java.util.*;

public class _3243_Shortest_Distance_After_Road_Addition_Queries_I {

    public int[] shortestDistanceAfterQueries(int n, int[][] queries) {
        List<List<Integer>> cities = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            cities.add(new ArrayList<>());
            cities.get(i).add(i + 1);
        }

        List<Integer> res = new ArrayList<>();
        for (int[] query : queries) {
            cities.get(query[0]).add(query[1]);
            res.add(shortestPath(cities, n));
        }

        return res.stream().mapToInt(Integer::intValue).toArray();
    }

    private int shortestPath(List<List<Integer>> cities, int n) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0});

        Set<Integer> visit = new HashSet<>();
        visit.add(0);

        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int cur = curr[0];
            int length = curr[1];

            if (cur == n - 1) return length;

            for (int nei : cities.get(cur)) {
                if (!visit.contains(nei)) {
                    q.offer(new int[]{nei, length + 1});
                    visit.add(nei);
                }
            }
        }
        return -1;
    }
}
