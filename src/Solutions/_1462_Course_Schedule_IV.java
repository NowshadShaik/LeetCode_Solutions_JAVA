package Solutions;

import java.util.*;

public class _1462_Course_Schedule_IV {

    Map<Integer, Set<Integer>> preMap = new HashMap<>();
    List<Integer>[] adj;

    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        adj = new ArrayList[numCourses];

        for (int i = 0; i < numCourses; i++)
            adj[i] = new ArrayList<>();

        for (int[] pre : prerequisites)
            adj[pre[1]].add(pre[0]);

        for (int i = 0; i < numCourses; i++)
            dfs(i);

        System.out.println(preMap);

        List<Boolean> res = new ArrayList<>();
        for (int[] query : queries) {
            if (preMap.get(query[1]).contains(query[0]))
                res.add(true);
            else
                res.add(false);
        }

        return res;
    }

    private Set<Integer> dfs(Integer curr) {
        if (preMap.containsKey(curr))
            return preMap.get(curr);

        Set<Integer> prereqs = new HashSet<>();

        for (int next : adj[curr]) {
            prereqs.addAll(dfs(next));
        }

        prereqs.add(curr);
        preMap.put(curr, prereqs);
        return prereqs;
    }
}
