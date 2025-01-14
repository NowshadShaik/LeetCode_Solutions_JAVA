package Solutions;

import java.util.*;

public class _0261_Graph_Valid_tree {

    Map<Integer, List<Integer>> adjList = new HashMap<>();
    Set<Integer> visited = new HashSet<>();

    public boolean validTree(int n, int[][] edges) {
        if (edges.length > n - 1)
            return false;

        for (int i = 0; i < n; i++)
            adjList.put(i, new ArrayList<>());

        for (int[] edge : edges) {
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }


        if (!dfs(0, -1))
            return false;

        return visited.size() == n;
    }

    private boolean dfs(int curr, int parr) {
        if (visited.contains(curr))
            return false;

        visited.add(curr);
        for (Integer next : adjList.get(curr)) {
            if (next == parr)
                continue;

            if (!dfs(next, curr))
                return false;
        }

        return true;
    }
}
