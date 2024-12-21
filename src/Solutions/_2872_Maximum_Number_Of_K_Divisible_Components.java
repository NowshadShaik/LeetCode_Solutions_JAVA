package Solutions;

import java.util.ArrayList;
import java.util.List;

public class _2872_Maximum_Number_Of_K_Divisible_Components {

    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
        List<Integer>[] adjList = new ArrayList[n];
        for (int i = 0; i < n; i++) adjList[i] = new ArrayList<>();

        for (int[] edge : edges) {
            int node1 = edge[0];
            int node2 = edge[1];
            adjList[node1].add(node2);
            adjList[node2].add(node1);
        }

        int[] componentCount = new int[1];

        dfs(0, -1, adjList, values, k, componentCount);

        return componentCount[0];
    }

    private int dfs(int current, int parrent, List<Integer>[] adjList, int[] values, int k, int[] componentCount) {

        int sum = 0;

        for (int neighborNode : adjList[current]) {
            if (neighborNode != parrent) {
                sum += dfs(neighborNode, current, adjList, values, k, componentCount);

                sum %= k;
            }
        }

        sum += values[current];
        sum %= k;

        if (sum == 0) {
            componentCount[0]++;
        }
        return sum;
    }
}
