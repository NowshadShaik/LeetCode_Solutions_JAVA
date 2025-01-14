package Solutions;

import java.util.ArrayList;
import java.util.List;

public class _0323_Number_Of_Connected_Components_In_An_Undirected_Graph {

    public int countComponents(int n, int[][] edges) {
        if (edges.length == 0) return n;

        List<Integer>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++)
            adj[i] = new ArrayList<>();

        for (int[] edge : edges) {
            adj[edge[0]].add(edge[1]);
            adj[edge[1]].add(edge[0]);
        }

        boolean[] visited = new boolean[n];
        int res = 0;

        for (int i = 0; i < n; i++) {

            if (!visited[i]) {
                dfs(i, adj, visited);
                res++;
            }
        }

        return res;
    }

    private void dfs(int curr, List<Integer>[] adj, boolean[] visited) {
        if (visited[curr])
            return;

        visited[curr] = true;
        for (int next : adj[curr])
            dfs(next, adj, visited);
    }
}
