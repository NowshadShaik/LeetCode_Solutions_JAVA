package Solutions;

import java.util.ArrayList;
import java.util.List;

public class _0802_Find_Eventual_Safe_States {

    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        boolean[] visit = new boolean[n];
        boolean[] isSafe = new boolean[n];

        for (int i = 0; i < n; i++) {
            dfs(i, graph, visit, isSafe);
        }

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!isSafe[i])
                res.add(i);
        }

        return res;
    }

    private boolean dfs(int i, int[][] graph, boolean[] visited, boolean[] isSafe) {
        if (isSafe[i])
            return true;

        if (visited[i])
            return false;

        visited[i] = true;
        isSafe[i] = true;

        for (int n : graph[i]) {
            if (dfs(n, graph, visited, isSafe))
                return true;
        }

        isSafe[i] = false;
        return false;
    }
}
