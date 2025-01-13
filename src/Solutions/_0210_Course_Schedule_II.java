package Solutions;

import java.util.*;

public class _0210_Course_Schedule_II {

    public int[] findOrder(int numCourses, int[][] prerequisites) {

        Map<Integer, List<Integer>> prereq = new HashMap<>();

        for (int i = 0; i < numCourses; i++)
            prereq.put(i, new ArrayList<>());

        for (int[] pre : prerequisites)
            prereq.get(pre[0]).add(pre[1]);

        List<Integer> output = new ArrayList<>();
        Set<Integer> visit = new HashSet<>();
        Set<Integer> cycle = new HashSet<>();

        for (int c = 0; c < numCourses; c++) {
            if (!dfs(c, prereq, visit, cycle, output))
                return new int[0];
        }

        int[] res = new int[numCourses];
        for (int i = 0; i < numCourses; i++)
            res[i] = output.get(i);

        return res;
    }

    private boolean dfs(int course, Map<Integer, List<Integer>> prereq, Set<Integer> visit,
                        Set<Integer> cycle, List<Integer> output) {

        if (cycle.contains(course))
            return false;

        if (visit.contains(course))
            return true;

        cycle.add(course);
        for (int pre : prereq.getOrDefault(course, Collections.emptyList())) {
            if (!dfs(pre, prereq, visit, cycle, output))
                return false;
        }

        cycle.remove(course);
        visit.add(course);
        output.add(course);
        return true;
    }
}
