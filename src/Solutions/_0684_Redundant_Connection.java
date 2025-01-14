package Solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _0684_Redundant_Connection {

    List<List<Integer>> adj;
    Set<Integer> cycle;
    boolean[] visit;
    int cycleStart;

    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;

        adj = new ArrayList<>();
        for (int i = 0; i <= n; i++)
            adj.add(new ArrayList<>());

        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        visit = new boolean[n + 1];
        cycle = new HashSet<>();
        cycleStart = -1;
        dfs(1, -1);

        for (int i = n - 1; i >= 0; i--) {
            if (cycle.contains(edges[i][0]) && cycle.contains(edges[i][1]))
                return edges[i];
        }

        return new int[0];
    }

    private boolean dfs(int node, int par) {
        if (visit[node]) {
            cycleStart = node;
            return true;
        }

        visit[node] = true;
        for (int next : adj.get(node)) {
            if (next == par)
                continue;

            if (dfs(next, node)) {
                if (cycleStart != -1)
                    cycle.add(node);

                if (node == cycleStart)
                    cycleStart = -1;

                return true;
            }
        }

        return false;
    }
}
