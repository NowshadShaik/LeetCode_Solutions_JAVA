package Solutions;

import java.util.*;

public class _0207_Course_Schedule {

    Map<Integer, List<Integer>> preMap = new HashMap<>();
    Set<Integer> visited = new HashSet<>();

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        for (int i = 0; i < numCourses; i++)
            preMap.put(i, new ArrayList<>());

        for (int[] pre : prerequisites)
            preMap.get(pre[0]).add(pre[1]);

        for (int i = 0; i < numCourses; i++) {
            if (!dfs(i))
                return false;
        }

        return true;
    }

    private boolean dfs(int i) {
        if (visited.contains(i))
            return false;

        if (preMap.get(i).isEmpty())
            return true;

        visited.add(i);
        for (int next : preMap.get(i)) {
            if (!dfs(next))
                return false;
        }

        visited.remove(i);
        preMap.put(i, new ArrayList<>());
        return true;
    }
}
